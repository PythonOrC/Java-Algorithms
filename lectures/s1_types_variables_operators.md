---
title: 1 - Types, Variables, Operators
---

## 1.0 Table of Contents

- [1.0 Table of Contents](#10-table-of-contents)
- [1.1 Why learn Java?](#11-why-learn-java)
- [1.2 Fundamentals of the Computer](#12-fundamentals-of-the-computer)
  - [1.2.1 Computer Logic:](#121-computer-logic)
  - [1.2.2 CPU Instructions:](#122-cpu-instructions)
  - [1.2.3 Programming Languages](#123-programming-languages)
  - [1.2.4 Compile Java](#124-compile-java)
- [1.3 First Program](#13-first-program)
  - [1.3.1 HelloWorld.java](#131-helloworldjava)
  - [1.3.2 Program Structure](#132-program-structure)
  - [1.3.3 Output to the Console](#133-output-to-the-console)
- [1.4 Types and Variables](#14-types-and-variables)
  - [1.4.1 Primitive Data Types](#141-primitive-data-types)
  - [1.4.2 Default Values](#142-default-values)
- [1.5 Variables](#15-variables)
  - [1.5.1 Variable Declaration](#151-variable-declaration)
  - [1.5.2 Variable Assignment](#152-variable-assignment)
  - [1.5.3 Variable Initialization](#153-variable-initialization)
  - [1.5.4 HelloWorld2.java](#154-helloworld2java)
- [1.6 Operators](#16-operators)
  - [1.6.1 Arithmetic Operators](#161-arithmetic-operators)
  - [1.6.2 Assignment Operators](#162-assignment-operators)
  - [1.6.3 Comparison Operators](#163-comparison-operators)
  - [1.6.4 Logical Operators](#164-logical-operators)
  - [1.6.5 Bitwise Operators](#165-bitwise-operators)
  - [1.6.6 Order of Operations](#166-order-of-operations)
  - [1.6.7 DoMath.java](#167-domathjava)
  - [1.6.8 DoMath2.java](#168-domath2java)
  - [1.6.9 String Concatenation](#169-string-concatenation)
- [1.7 Assignment](#17-assignment)

## 1.1 Why learn Java?

- Widely Used:
  - web development
  - mobile app development
  - enterprise software
  - scientific computing
  - etc
- ample resources
  - libraries
  - frameworks
  - tools for learning and building Java application
- platform independence
  - write code once
  - run on any operating system that supports Java
- Android applications
  - opportunities to develop for the Android platform
- emphasis on OOP concepts
  - object-oriented programming
  - fundamental to modern software development
- reliability
  - memory management
  - exception handling
  - help create stable and secure applications.
- good scalability
  - build applications small or large
  - enterprise-level systems
  - a versatile language

<p style="text-align:center"><img src="images/1.1.jpg" width="75%"></p>

## 1.2 Fundamentals of the Computer

### 1.2.1 Computer Logic:

[![](https://mermaid.ink/img/pako:eNo9kE9rhDAQxb9KmNMKrjUa_yRbCq17Weiyy5a9FC9BoxvQRGJsa8Xv3rSlZQ4z8_jNezALVLoWwKDp9Ht148ai58uuVAg9bko4il6buQQP3W-3D-jJSYVQ1vAOnY2uxDhK1aKrkhZtivPV-ycLRx7UMNm702RdQ5vDyUN78SbdkaN24EMvTM9l7bKX77wS7E30ogTmRldqdQyfrH6ZVQXMmkn4MA01t2IveWt4D6zh3ejUgatXrfs_yK3AFvgAhkkSRCTHeURpnoU0iXyYgZGQBpRkMc5wGKcxTZPVh88fhzDIEhxjkmc5SeOMJNgHUUurzfH3T5VWjWxh_QLfCl1e?type=png)](https://mermaid.live/edit#pako:eNo9kE9rhDAQxb9KmNMKrjUa_yRbCq17Weiyy5a9FC9BoxvQRGJsa8Xv3rSlZQ4z8_jNezALVLoWwKDp9Ht148ai58uuVAg9bko4il6buQQP3W-3D-jJSYVQ1vAOnY2uxDhK1aKrkhZtivPV-ycLRx7UMNm702RdQ5vDyUN78SbdkaN24EMvTM9l7bKX77wS7E30ogTmRldqdQyfrH6ZVQXMmkn4MA01t2IveWt4D6zh3ejUgatXrfs_yK3AFvgAhkkSRCTHeURpnoU0iXyYgZGQBpRkMc5wGKcxTZPVh88fhzDIEhxjkmc5SeOMJNgHUUurzfH3T5VWjWxh_QLfCl1e)

### 1.2.2 CPU Instructions:

```java
z=x+y;
```

```
LOAD x
ADD  y
STORE z
```

### 1.2.3 Programming Languages

- High-level languages
  - Java
  - Python
  - C++
  - C#
  - etc
- wasier to understand than assembly
- must be translate to machine code to run

### 1.2.4 Compile Java

- Java is a compiled language
- Java source code is compiled into bytecode
  [![](https://mermaid.ink/img/pako:eNpFkM1uwjAQhF_F2lOQAgrGzo-pKhU4VeVSpB6QLyvHNKmcGBmnLY3y7nVAEbfd2W9Wo-lB2VKDgJOxP6pC58nb-1q2hLxEEl7xG8nBdk5psg0ciRZfQZpJmJGn-fyZbCZoa5tzbbQj0QioB7ENxObqtbrblcHL5XHdTf6P2vkODdmjqupW39-M3BpiaLRrsC5Dyn5MJsFXutESRBhLfcLOeAmyHQKKnbeHa6tAeNfpGLpziV7vavx02IA4obkE9Yzt0dpmgsIKoodfEDxfJFmRJnmerFLK0jSGKwhG2SJnWcE5Leiy4HSI4e_mT4K-LChnOVtxyjNexKDL2lu3v9d6a3f4B4ukavI?type=png)](https://mermaid.live/edit#pako:eNpFkM1uwjAQhF_F2lOQAgrGzo-pKhU4VeVSpB6QLyvHNKmcGBmnLY3y7nVAEbfd2W9Wo-lB2VKDgJOxP6pC58nb-1q2hLxEEl7xG8nBdk5psg0ciRZfQZpJmJGn-fyZbCZoa5tzbbQj0QioB7ENxObqtbrblcHL5XHdTf6P2vkODdmjqupW39-M3BpiaLRrsC5Dyn5MJsFXutESRBhLfcLOeAmyHQKKnbeHa6tAeNfpGLpziV7vavx02IA4obkE9Yzt0dpmgsIKoodfEDxfJFmRJnmerFLK0jSGKwhG2SJnWcE5Leiy4HSI4e_mT4K-LChnOVtxyjNexKDL2lu3v9d6a3f4B4ukavI)

## 1.3 First Program

go to [repl.it](https://repl.it/) and create a new Java project

### 1.3.1 HelloWorld.java

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

### 1.3.2 Program Structure

```java
class CLASSNAME{
  public static void main(String[] args) {
    // code goes here
  }
}
```

### 1.3.3 Output to the Console

```java
System.out.println("some string");
```

## 1.4 Types and Variables

- Java is a statically typed language
  - variables must be declared before they can be used

### 1.4.1 Primitive Data Types

| Type        | Description              | Size    | Range                                                   |
| ----------- | ------------------------ | ------- | ------------------------------------------------------- |
| byte        | 8-bit signed integer     | 1 byte  | -128 to 127                                             |
| short       | 16-bit signed integer    | 2 bytes | -32,768 to 32,767                                       |
| **int**     | 32-bit signed integer    | 4 bytes | -2,147,483,648 to 2,147,483,647                         |
| long        | 64-bit signed integer    | 8 bytes | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float       | 32-bit floating point    | 4 bytes | 3.4e-038 to 3.4e+038                                    |
| **double**  | 64-bit floating point    | 8 bytes | 1.7e-308 to 1.7e+308                                    |
| **boolean** | true or false            | 1 bit   | true or false                                           |
| **char**    | 16-bit unicode character | 2 bytes | 0 to 65,535                                             |

on top of these, Java have support for a character string type, called String

### 1.4.2 Default Values

| Type    | Default Value |
| ------- | ------------- |
| byte    | 0             |
| short   | 0             |
| int     | 0             |
| long    | 0L            |
| float   | 0.0f          |
| double  | 0.0d          |
| boolean | false         |
| char    | '\u0000'      |
| String  | null          |

## 1.5 Variables

variables are named location that stores a value of one particular type

### 1.5.1 Variable Declaration

```java
type name;
```

Example:

```java
int x;
String foo;
```

### 1.5.2 Variable Assignment

```java
name = value;
```

Example:

```java
int x;
x = 5;

String foo;
foo = "bar";
```

### 1.5.3 Variable Initialization

```java
type name = value;
```

Example:

```java
int x = 5;

String foo = "bar";
```

### 1.5.4 HelloWorld2.java

```java
public class HelloWorld2 {
  public static void main(String[] args) {
    String message = "Hello World";
    System.out.println(message);
    message = "Hello World 2";
    System.out.println(message);
  }
}
```

## 1.6 Operators

symbols that perform operations on operands
operands are variables and values that operators act on

### 1.6.1 Arithmetic Operators

| Operator | Description    | Example |
| -------- | -------------- | ------- |
| +        | addition       | x + y   |
| -        | subtraction    | x - y   |
| \*       | multiplication | x \* y  |
| /        | division       | x / y   |
| %        | modulus        | x % y   |
| ++       | increment      | x++     |
| --       | decrement      | x--     |

### 1.6.2 Assignment Operators

| Operator | Description         | Example |
| -------- | ------------------- | ------- |
| =        | assign              | x = y   |
| +=       | add and assign      | x += y  |
| -=       | subtract and assign | x -= y  |
| \*=      | multiply and assign | x \*= y |
| /=       | divide and assign   | x /= y  |
| %=       | modulus and assign  | x %= y  |
| ...      | ...                 | ...     |

### 1.6.3 Comparison Operators

| Operator | Description              | Example |
| -------- | ------------------------ | ------- |
| ==       | equal to                 | x == y  |
| !=       | not equal to             | x != y  |
| >        | greater than             | x > y   |
| <        | less than                | x < y   |
| >=       | greater than or equal to | x >= y  |
| <=       | less than or equal to    | x <= y  |

### 1.6.4 Logical Operators

| Operator | Description | Example           |
| -------- | ----------- | ----------------- |
| &&       | logical and | x > 0 && x < 10   |
| \|\|     | logical or  | x < 0 \|\| x > 10 |
| !        | logical not | !(x == y)         |

### 1.6.5 Bitwise Operators

| Operator | Description          | Example |
| -------- | -------------------- | ------- |
| &        | bitwise and          | x & y   |
| \|       | bitwise or           | x \| y  |
| ^        | bitwise xor          | x ^ y   |
| ~        | bitwise compliment   | ~x      |
| <<       | left shift           | x << 2  |
| >>       | right shift          | x >> 2  |
| >>>      | unsigned right shift | x >>> 2 |
| ...      | ...                  | ...     |

### 1.6.6 Order of Operations

The standard order of operations in math

1. Parentheses
2. Multiplication and Division
3. Addition and Subtraction

### 1.6.7 DoMath.java

```java
class DoMath{
  public static void main(String[] arguments){
    double score = 1.0 + 2.0 * 3.0;
    SSystem.out.println(score);
    score = score / 2.0;
    System.out.println(score);
  }
}
```

### 1.6.8 DoMath2.java

```java
class DoMath2{
  public static void main(String[] arguments){
    double score = 1.0 + 2.0 * 3.0;
    System.out.println(score);
    double score2 = score / 2.0;
    System.out.println(score);
    System.out.println(score2);
  }
}
```

### 1.6.9 String Concatenation

you can use the + operator to concatenate strings

```java
String message = "Hello" + " " + "World";
message += "!";
//message = "Hello World!"
```

## 1.7 Assignment

Compute the position of a falling object and print it

- use the equation
- `position = 0.5 * g * time * time + initialVelocity * time + initialPosition`
- where `g` is the gravity constant `-9.8 m/s^2`
- `position` is in meters
- `time` is in seconds
- `initialVelocity` is in meters per second
- `initialPosition` is in meters

if `time` is 10 seconds, `initialVelocity` is 0, and `initialPosition` is 0, then the position should be `-490.0m`

```java
class FallingObject{
  public static void main(String[] args){
    /*
     * Steps to solve the problem
     *  1. Declare variables
     *  2. Assign values to variables
     *  3. Compute the position
     *  4. Print the result
     */
  }
}
```

[**Return to Main Page**](index)
