# Java Practice Questions

A collection of beginner Java programs I wrote while practising programming basics, arrays (DSA), and the Java Collections Framework. Most programs are small, self-contained console apps that read input with `Scanner` and print the result.

## Project Structure

```
questions/
├── basics/          # Number and string problems
├── dsa/             # Array problems
├── collections/     # Java Collections Framework exercises
├── compare.java     # Custom comparison interface used by main1.java
├── main1.java       # Comparator, HashMap and LinkedHashMap experiments
└── list.java        # Placeholder (empty)
```

## Programs

### `basics/` — Number and string problems

| File | Problem |
|------|---------|
| `first.java` | Sum of two numbers |
| `second.java` | Count the digits in a number |
| `third.java` | Sum (and count) of the digits in a number |
| `forth.java` | Reverse a number |
| `fifth.java` | Check if a number is a palindrome (also a small object / `System.gc()` demo) |
| `sixth.java` | Check if a number is prime (trial division up to √n) |
| `prime.java` | Quick prime check (divisibility by 2 or 3 only) |
| `printnum.java` | Print all prime numbers from 1 to n |
| `armstrongnum.java` | Check if a number is an Armstrong number |
| `perfect.java` | Check if a number is a perfect number |
| `factorial.java` | Factorial of a number |
| `fibonacci.java` | Print the Fibonacci series (recursive) |
| `gdc.java` | GCD of two numbers using `BigInteger.gcd` |
| `multiplicationtable.java` | Multiplication table of a number |
| `revesedStr.java` | Reverse a string and check if it is a palindrome |

### `dsa/` — Arrays

| File | Problem |
|------|---------|
| `first.java` | Read an array from input and print it |
| `second.java` | Find the largest element in an array |
| `count.java` | Count the even and odd elements in an array |
| `reverse.java` | Reverse an array in place (two-pointer approach) |
| `secondlargest.java` | Find the second largest element (*work in progress*) |

### `collections/` — Collections Framework

| File | Problem |
|------|---------|
| `duplicates.java` | Remove duplicates from an `ArrayList` using a `HashSet` |

### Root

| File | Description |
|------|-------------|
| `main1.java` | Experiments with `ArrayList`, a custom `Comparator` (sort strings by length), `HashMap` (including `null` keys) and `LinkedHashMap` |
| `compare.java` | A custom `compare(Integer, Integer)` interface implemented in `main1.java` |

## Getting Started

### Prerequisites

- JDK 11 or later (`java -version` to check)

### Clone

```bash
git clone https://github.com/Chetanya729/questions.git
cd questions
```

### Run a program

From the repository root, run any program directly from its source file (Java 11+):

```bash
java basics/factorial.java
```

Or compile first, then run it using its package name:

```bash
javac basics/factorial.java
java basics.factorial
```

Programs in the root folder have no package, so compile them together:

```bash
javac compare.java main1.java
java main1
```

### IntelliJ IDEA

The repo includes IntelliJ project files (`.idea/`, `questions.iml`). Open the folder in IntelliJ, then right-click any file with a `main` method and choose **Run**.

## Author

**Chetanya** — [@Chetanya729](https://github.com/Chetanya729)
