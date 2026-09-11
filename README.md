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

### Easy (1–15)
### Medium (16–35)
### Hard (36–45) — Employee data
### Very Hard (46–50)
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
