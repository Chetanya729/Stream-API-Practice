package org.example.Questions;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class fifth {
    static void main() {
        List<Employee> Employees = List.of(new Employee(101, "John", "IT", 90000, 30),
                new Employee(102, "Alice", "HR", 75000, 28),
                new Employee(103, "Bob", "IT", 120000, 35),
                new Employee(104, "John", "FINANCE", 110000, 40),
                new Employee(105, "Alice", "HR", 95000, 32),
                new Employee(106, "Michael", "FINANCE", 130000, 38)
        );

        List<Employee> distinctEmployees = Employees.stream().collect(Collectors.groupingBy(Employee::getName)).values().stream().filter(list -> list.size() > 1).flatMap(Collection::stream).toList();
        System.out.println("Duplicate employees"+distinctEmployees);

        Map<String, Map<Integer, List<Employee>>> nestedGroup = Employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(Employee::getAge)));

        System.out.println(nestedGroup);

    }
}
class DuplicateEmployee{
    int id;
    String name;
    String department;
    int salary;
    int age;

    public DuplicateEmployee(int id, String name, String department, int salary, int age) {
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
