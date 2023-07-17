---
title: 3 - Loops, Arrays
permalink: /lectures/loops_arrays
---

## 3.0 Table of Contents<!-- omit from toc -->

- [3.1 Session 2 Review](#31-session-2-review)
  - [3.1.1 Review of Topics](#311-review-of-topics)
  - [3.1.2 Solution to Assignment 2](#312-solution-to-assignment-2)
- [3.2 Good Programming Style](#32-good-programming-style)
  - [3.2.1 Rule #1: Naming Conventions](#321-rule-1-naming-conventions)
  - [3.2.2 Rule #2: Indentation](#322-rule-2-indentation)
  - [3.2.3 Rule #3: Whitespace](#323-rule-3-whitespace)
  - [3.2.4 Rule #4: Comments](#324-rule-4-comments)
- [3.3 Loops](#33-loops)
  - [3.3.1 `while` Loops](#331-while-loops)
  - [3.3.2 `for` Loops](#332-for-loops)
  - [3.3.3 Branching Statements](#333-branching-statements)

## 3.1 Session 2 Review

### 3.1.1 Review of Topics

- Variables and Data Types
- Operators
- Type Conversion and Type Casting
- Methods and parameters
- Conditionals

### 3.1.2 Solution to Assignment 2

[View Solution](/homework#2---assignment-2---wage-calculator)

## 3.2 Good Programming Style

- The goal of good style is to make your code more readable by **you** and by **others**

### 3.2.1 Rule #1: Naming Conventions

Bad:

```java
String a1;
int a2;
double b;
```

Good:

```java
String firstName;
String lastName;
int age;
```

- **Use meaningful names** for variables, methods, and classes
- variable and method names should be **lowerCamelCase**
- class names should be **UpperCamelCase**

### 3.2.2 Rule #2: Indentation

Bad:

```java
public static void main(String[] args) {
int x = 5;
x = x * x;
if (x > 20) {
System.out.println("x is greater than 20");
}
}
```

Good:

```java
public static void main(String[] args) {
    int x = 5;
    x = x * x;
    if (x > 20) {
        System.out.println("x is greater than 20");
    }
}
```

- **Indentation** is important for readability
- although indentation is not required for the compiler, it is required for the **human reader**

### 3.2.3 Rule #3: Whitespace

put spaces between operators and operands

Bad:

```java
double celcius=5/9*(fahrenheit-32);
```

Good:

```java
double celcius = 5 / 9 * (fahrenheit - 32);
```

### 3.2.4 Rule #4: Comments

- **Comments** are used to explain what your code does
- they are ignored by the compiler
- denote comments with `//` for single line comments and `/* */` for multi-line comments

```java
// this is a single line comment

/* this
is
a
multi-line
comment */
```

## 3.3 Loops

```java
static void main(String[] args) {
    System.out.println("Rule #1");
    System.out.println("Rule #2");
    System.out.println("Rule #3");
    System.out.println("Rule #4");
}
```

- if I wanted to print out the rules 100 times, I would have to copy and paste the `System.out.println()` statement 100 times

- **Loops** are used to repeat a block of code
- there are two types of loops in Java: `for` loops and `while` loops

### 3.3.1 `while` Loops

```java
while (condition) {
    // code to be repeated
}
```

Example:

```java
int i = 0;
while (i < 10) {
    System.out.println("Rule #" + i);
    i++;
}
```

- the `while` loop will repeat the code inside the block as long as the condition is true
- therefore it is important to **update the condition** inside the loop and make sure that it will eventually become false
- otherwise, the loop will run forever (infinite loop)

### 3.3.2 `for` Loops

```java
for (initialization; condition; update) {
    // code to be repeated
}
```

Example:

```java
for (int i = 0; i < 10; i++) {
    System.out.println("Rule #" + i);
}
```

- `for` loops combine the initialization, condition, and update into one line, making it easier to read and write
- the `for` loop is equivalent to the `while` loop above

### 3.3.3 Branching Statements

- **Branching statements** are used to control the flow of a program
- `break` and `continue` are two branching statements that are used with loops

```java

```
