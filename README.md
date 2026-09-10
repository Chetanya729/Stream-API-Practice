# Stream API Practice

Hands-on practice with the **Java Stream API**, working through a set of 50 questions that go from simple filtering and sorting to grouping and reporting on employee data.

The full question list, with a difficulty level and sample input for each, is in [`java_streams_questions.csv`](java_streams_questions.csv).

## Tech Stack

- Java 26 (uses the `static void main()` and `IO.println` features added in Java 25)
- Maven
- IntelliJ IDEA

## Project Structure

```
StreamAPIpractice/
├── java_streams_questions.csv            # The 50 practice questions
├── pom.xml
└── src/main/java/org/example/
    ├── Main.java                         # IntelliJ starter template
    └── Questions/
        ├── first.java                    # Integer list questions
        └── Second.java                   # String list questions
```

## Concepts Covered

| Concept | Stream operations used |
|---------|------------------------|
| Filtering | `filter`, `distinct` |
| Transforming | `map`, `mapToInt`, `mapToObj`, `flatMap` |
| Sorting and slicing | `sorted`, `Comparator.naturalOrder()` / `reverseOrder()`, `skip`, `limit` |
| Finding | `findFirst`, `min`, `Optional.ifPresent` |
| Aggregating | `sum`, `Collectors.averagingInt`, `Collectors.counting` |
| Grouping | `Collectors.groupingBy`, `Collectors.partitioningBy`, `LinkedHashMap` to keep insertion order |

## Progress

**23 of 50 solved** — ✅ solved · 🟡 partly solved · ⬜ not yet

### Easy (1–15)

| # | Question | Status | File |
|---|----------|:------:|------|
| 1 | Find all even numbers | ✅ | `first.java` |
| 2 | Find all odd numbers | ✅ | `first.java` |
| 3 | Sum of all numbers | ✅ | `first.java` |
| 4 | Maximum number | ⬜ | |
| 5 | Minimum number | ✅ | `first.java` |
| 6 | Count elements | ✅ | `first.java` |
| 7 | Remove duplicates with `distinct()` | ✅ | `first.java` |
| 8 | Sort ascending | ✅ | `first.java` |
| 9 | Sort descending | ✅ | `first.java` |
| 10 | Convert strings to uppercase | ✅ | `Second.java` |
| 11 | Strings starting with "A" | ✅ | `Second.java` |
| 12 | Strings longer than 5 characters | ✅ | `Second.java` |
| 13 | Join a list into a comma-separated string | 🟡 | `Second.java` |
| 14 | Any number greater than 100 | ✅ | `first.java` |
| 15 | All numbers positive | 🟡 | `first.java` |

### Medium (16–35)

| # | Question | Status | File |
|---|----------|:------:|------|
| 16 | First element | ✅ | `first.java` |
| 17 | First non-repeated character | ✅ | `Second.java` |
| 18 | All duplicate elements | ✅ | `first.java` |
| 19 | Second-highest number | ✅ | `first.java` |
| 20 | Second-lowest number | ✅ | `first.java` |
| 21 | Top 3 highest numbers | ✅ | `first.java` |
| 22 | Top 3 lowest numbers | ✅ | `first.java` |
| 23 | Average of all numbers | ✅ | `first.java` |
| 24 | Partition into even/odd with `partitioningBy()` | ✅ | `first.java` |
| 25 | Group strings by length | ✅ | `Second.java` |
| 26 | Frequency of each element | ✅ | `Second.java` |
| 27 | Frequency of each character | ⬜ | |
| 28 | Most frequent element | ⬜ | |
| 29 | Longest string | ⬜ | |
| 30 | Shortest string | ⬜ | |
| 31 | `List<String>` to `Map<String, Integer>` (string → length) | ⬜ | |
| 32 | Common elements between two lists | ⬜ | |
| 33 | Elements in the first list but not the second | ⬜ | |
| 34 | Flatten `List<List<Integer>>` with `flatMap()` | ⬜ | |
| 35 | Sum of a nested list | ⬜ | |

### Hard (36–45) — Employee data

| # | Question | Status |
|---|----------|:------:|
| 36 | Highest-paid employee | ⬜ |
| 37 | Second-highest-paid employee | ⬜ |
| 38 | Highest-paid employee in each department | ⬜ |
| 39 | Average salary per department | ⬜ |
| 40 | Employee count per department | ⬜ |
| 41 | Group by department, sort by salary | ⬜ |
| 42 | Second-highest salary per department | ⬜ |
| 43 | Employee with the highest salary per department | ⬜ |
| 44 | Youngest employee per department | ⬜ |
| 45 | Department with the highest average salary | ⬜ |

### Very Hard (46–50)

| # | Question | Status |
|---|----------|:------:|
| 46 | Nth-highest salary (3rd highest) | ⬜ |
| 47 | Duplicate employees by name | ⬜ |
| 48 | Nested grouping: department → age | ⬜ |
| 49 | Highest-paid per department, where the department's average salary is > 100000 | ⬜ |
| 50 | Full employee salary report | ⬜ |

## Getting Started

### Prerequisites

- JDK 26 (JDK 25 or later is needed for `static void main()` and `IO.println`)
- Maven 3.9+

### Clone

```bash
git clone https://github.com/Chetanya729/Stream-API-Practice.git
cd Stream-API-Practice
```

### Run

Run a single file straight from source:

```bash
java src/main/java/org/example/Questions/first.java
```

Or build with Maven and run a class:

```bash
mvn compile
```

```bash
java -cp target/classes org.example.Questions.Second
```

In IntelliJ IDEA, open the project, then click the ▶ icon next to `main()` in any file under `Questions/`.

## Author

**Chetanya** — [@Chetanya729](https://github.com/Chetanya729)
