package org.example.Questions;

import javax.sound.midi.SoundbankResource;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Fourth {
    static void main() {
        List<Employee> Employees = List.of(new Employee(101,"John","IT",90000,30),
                new Employee(102,"Alice","HR",75000,28),
                new Employee(103,"Bob","IT",120000,35),
                new Employee(104,"David","FINANCE",110000,40),
                new Employee(105,"Emma","HR",95000,32),
                new Employee(106,"Michael","FINANCE",130000,38)
        );

        List<Employee> sortedEmployees = Employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println("sorted : \n" + sortedEmployees);

        List<Employee> highestPaidEmployee = Employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1).toList();
        System.out.println("highest paid employee : \n" + highestPaidEmployee);

        List<Employee> secondhighestPaidEmployee = Employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).skip(1).toList();
        System.out.println("second highest paid employee : \n" + secondhighestPaidEmployee);

        Map<String,List<Employee>>highestPaidbyDep = Employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Highest Paid by Department"+highestPaidbyDep);


        Map<String,Optional<Employee>> groupByDepartment = Employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
        System.out.println("Group bye department :\n" + groupByDepartment);

        Map<String,Double>averageInDep = Employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));
        System.out.println("Average salary in department :\n" + averageInDep);

        Map<String,Long>noIndep = Employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Number of employees in department :\n" + noIndep);

        Map<String,List<Employee>> groupByDepartmentsorted = Employees.stream().sorted((e1,e2) -> e2.getSalary() - e1.getSalary()).collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Group bye department sorted :\n" + groupByDepartmentsorted);

        List<Employee> youngest = Employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).limit(1).toList();
        System.out.println("Youngest employee :\n" + youngest);

        List<Employee>highestaverageByDep = Employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)))).values().stream().flatMap(Optional::stream).toList();
        System.out.println("Highest average salary by department :\n" + highestaverageByDep);

        List<Employee> thirdHighestSalary = Employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).skip(2).toList();
        System.out.println("third highest salary : \n" + thirdHighestSalary);
    }
}
class Employee{
    int id;
    String name;
    String department;
    int salary;
    int age;

    public Employee(int id, String name, String department, int salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{ id= " + id + ", name="  + name + " , salary=" + salary + ", department=" + department + ",age=" + age + "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
