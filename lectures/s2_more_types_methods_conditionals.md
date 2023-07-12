---
title: 2 - More Types, Methods, Conditionals
---

## 2.0 Table of Contents <!-- omit from toc -->

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

[View Solution](homework)

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

**Error Message**

```
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

[**Return to Top**](#20-Table-of-Contents)

[**Return to Main Page**](index)
