---
title: 2 - More Types, Methods, Conditionals
permalink: /lectures/more_types_methods_conditionals
---

## 2.0 Table of Contents<!-- omit from toc -->

- [2.1 Session 1 Review](#21-session-1-review)
  - [2.1.1 Types](#211-types)
  - [2.1.2 Variables](#212-variables)
  - [2.1.3 Operators](#213-operators)
  - [2.1.4 Solution to Homework 1](#214-solution-to-homework-1)
- [2.2 More Types](#22-more-types)
  - [2.2.1 Division](#221-division)
  - [2.2.2 Type Mismatch](#222-type-mismatch)
  - [2.2.3 Casting](#223-casting)
- [2.3 Methods](#23-methods)
  - [2.3.1 Basic Method](#231-basic-method)
    - [NewLines.java](#newlinesjava)
  - [2.3.3 Parameters](#233-parameters)
    - [Square.java](#squarejava)
  - [2.3.4 Common Errors](#234-common-errors)
    - [Square2.java](#square2java)
    - [Square3.java](#square3java)
  - [2.3.5 Multiple Parameters](#235-multiple-parameters)
    - [Multiply.java](#multiplyjava)
  - [2.3.6 Return Values](#236-return-values)
    - [Square4.java](#square4java)
  - [2.3.7 Variable Scope](#237-variable-scope)
    - [Scope.java](#scopejava)
  - [2.3.8 Abstraction](#238-abstraction)
- [2.4 Conditionals](#24-conditionals)
  - [2.4.1 If Statements](#241-if-statements)
  - [2.4.2 Comparison Operators](#242-comparison-operators)
  - [2.4.3 Logical Operators](#243-logical-operators)
  - [2.4.4 If-Else Statements](#244-if-else-statements)
  - [2.4.5 If-Else-If Statements](#245-if-else-if-statements)
- [2.5 Assignment 2 - Wage Calculator](#25-assignment-2---wage-calculator)

## 2.1 Session 1 Review

### 2.1.1 Types

- boolean: truth values (e.g. true, false)
- int: integer numbers (e.g. 1, 2, 3, 4, 5, ...)
- double: real numbers (e.g. -2.0, -1.0, 0.0, 1.0, 2.0, ...)
- string: text (e.g. "Hello World!")

### 2.1.2 Variables

location in memory that stores a value

```java
String a = "letter a";
String b = "letter b";
String c = a + " and " + b;
System.out.println(c);
```

### 2.1.3 Operators

- Arithmetic Operators are used to perform common mathematical operations.
- Assignment Operators are used to assign values to variables.
- Comparison Operators are used to compare two values.
- Logical Operators are used to determine the logic between variables or values.

### 2.1.4 Solution to Homework 1

[View Solution](/homework#assignment-1-falling-object)

## 2.2 More Types

### 2.2.1 Division

Division works differently for integers and doubles. For integers, division is integer division. For doubles, division is floating point division.

```java
double a = 5.0/2.0; // a = 2.5
int b = 5/2; // b = 2
double c = 5/2; // c = 2.0
```

### 2.2.2 Type Mismatch

```java
String a = 5.0; // error
double b = "hello"; // error
int c = 5.0; // error
```

Error Message:

```error
test.java.2: incompatible types
found: double
required: java.lang.String
String a = 5.0;
```

### 2.2.3 Casting

```java
int a  = 2; // a = 2
double a = 2; // a = 2.0 (implicit casting)

int a  =2.0; // error
int a = (int) 2.7; // a = 2

double a = 2/3; // a = 0.0
double a = (double) 2/3; // a = 0.666...
```

## 2.3 Methods

### 2.3.1 Basic Method

- A method is a block of code which only runs when it is called.
- You can pass data, known as `parameters`, into a method.
- define the code once, and use it many times.
- method must exist within a class

```java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```

- To Call the method: `myMethod();`
- `myMethod()` is the name of the method
- `static` means that the method belongs to the Main class and not an object of the Main class.
- `void` means that this method does not have a return value.

#### NewLines.java

```java
class NewLines {
  public static void newLine() {
    System.out.println();
  }
  public static void threeLines() {
    newLine();
    newLine();
    newLine();
  }

  public static void main(String[] args) {
    System.out.println("First line.");
    threeLines();
    System.out.println("Second line.");
  }
}
```

### 2.3.3 Parameters

```java
public static void myMethod(TYPE NAME) {
  // code to be executed
}
```

- to call the method: `myMethod(VALUE);`

#### Square.java

```java
class Square{
  public static void printSquare(int x) {
    System.out.println(x * x);
  }

  public static void main(String[] args){
    int value = 2;
    printSquare(value); // 4
    printSquare(3); // 9
    printSquare(2 * value); // 16
  }
}
```

### 2.3.4 Common Errors

#### Square2.java

```java
class Square2{
  public static void printSquare(int x) {
    System.out.println(x * x);
  }

  public static void main(String[] args){
    printSquare("hello");
    printSquare(5.5);
  }
}
```

#### Square3.java

```java
class Square3{
  public static void printSquare(double x) {
    System.out.println(x * x);
  }

  public static void main(String[] args){
    printSquare(5);
  }
}
```

### 2.3.5 Multiple Parameters

```java
...
public static void myMethod(TYPE NAME1, TYPE NAME2){
  // code to be executed
}
...
```

#### Multiply.java

```java
class Multiply{
  public static void times(double x, double y) {
    System.out.println(x * y);
  }

  public static void main(String[] args){
    times(2, 3); // 6
    times(4, 5); // 20
    times(6, 7); // 42
  }
}
```

### 2.3.6 Return Values

```java
...
public static TYPE myMethod(){
  // code to be executed
  return VALUE;
}
...
```

- `return` statement is used to return a value from the method
- `void` means that this method does not have a return value.

#### Square4.java

```java
class Square4{
  public static double square(double x) {
    return x * x;
  }

  public static void main(String[] args){
    System.out.println(square(5)); // 25.0
    double result = square(3); // 9.0
    System.out.println(result); // 9.0
  }
}
```

### 2.3.7 Variable Scope

- The scope of a variable is the part of the program where the variable is accessible.
- variables only exist within the block `{}` they are defined in

#### Scope.java

```java
class Scope1{
  public static double printSquare(int x) {
    System.out.println("printSquare x=" + x);
    x *= x;
    System.out.println("printSquare x=" + x);
  }

  public static void main(String[] args){
    int x = 5;
    System.out.println("main x=" + x);
    printSquare(x);
    System.out.println("main x=" + x);
  }
}
```

### 2.3.8 Abstraction

- complex programs are built from simple methods.
- methods can be individually developed, tested, and reused.
- user of method does not need to know how it works.
- this is called `abstraction`

## 2.4 Conditionals

### 2.4.1 If Statements

```java
if (CONDITION) {
  // code to be executed if condition is true
}
```

```java
public static void test(int x) {
  if (x > 5) {
    System.out.println("x is greater than 5");
  }
}

public static void main(Stringp[] args){
  test(6); // x is greater than 5
  test(5);
  test(4);
}
```

```java
Class AbsoluteValue{
  public static int abs(int x) {
    if (x < 0) {
      return -x;
    } else {
      return x;
    }
  }

  public static void main(String[] args){
    System.out.println(abs(5)); // 5
    System.out.println(abs(-5)); // 5
  }
}
```

### 2.4.2 Comparison Operators

| Operator | Description                | Example |
| -------- | -------------------------- | ------- |
| ==       | equal to (= is assignment) | x == y  |
| !=       | not equal to               | x != y  |
| >        | greater than               | x > y   |
| <        | less than                  | x < y   |
| >=       | greater than or equal to   | x >= y  |
| <=       | less than or equal to      | x <= y  |

### 2.4.3 Logical Operators

| Operator | Description | Example  |
| -------- | ----------- | -------- |
| &&       | and         | x && y   |
| \|\|     | or          | x \|\| y |
| !        | not         | !x       |

```java
if (x>6){
  if (x<10){
    System.out.println("x is between 6 and 10");
  }
}
```

```java
if (x>6 && x<10){
  System.out.println("x is between 6 and 10");
}
```

### 2.4.4 If-Else Statements

```java
if (CONDITION) {
  // code to be executed if condition is true
} else {
  // code to be executed if condition is false
}
```

```java
public static void test(int x){
  if (x > 5) {
    System.out.println("x is greater than 5");
  } else {
    System.out.println("x is less than or equal to 5");
  }
}

public static void main(String[] args){
  test(6); // x is greater than 5
  test(5); // x is less than or equal to 5
  test(4); // x is less than or equal to 5
}
```

### 2.4.5 If-Else-If Statements

```java
if (CONDITION1) {
  // code to be executed if condition1 is true
} else if (CONDITION2) {
  // code to be executed if the condition1 is false and condition2 is true
} else {
  // code to be executed if the condition1 is false and condition2 is false
}
```

```java
public static void test(int x){
  if (x > 5) {
    System.out.println("x is greater than 5");
  } else if (x < 5) {
    System.out.println("x is less than 5");
  } else {
    System.out.println("x is equal to 5");
  }
}

public static void main(String[] args){
  test(6); // x is greater than 5
  test(5); // x is equal to 5
  test(4); // x is less than 5
}
```

## 2.5 Assignment 2 - Wage Calculator

Write a method that calculates the weekly wage of an employee. The method should take as input the number of hours worked and the hourly wage, and print the total wage.

- An employee gets paid (hours worked) × (hourly rate), for each hour up to 40 hours.
- For every hour over 40, they get overtime = (hourly rate) × 1.5.
- The base pay must not be less than the minimum wage ($15.00 an hour). If it is, print an error.
- If the number of hours is greater than 60, print an error message.

**Specifications**:

- Name the method `calculateWage`
- input: `int hours`, `double wage`
- output: no return value and print the result

**Cases**:

- find the wage for an employee who worked 50 hours at $9.99/hour
- find the wage for an employee who worked 50 hours at $15.00/hour
- find the wage for an employee who worked 63 hours at $25.00/hour

[View Solution](/homework#assignment-2-wage-calculator)

[**Return to Top**](#20-table-of-contents)

[**Return to Main Page**](index)
