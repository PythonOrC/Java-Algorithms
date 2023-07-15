---
title: Assignments
permalink: /homework/
---

# 0 - Table of Contents

- [0 - Table of Contents](#0---table-of-contents)
- [1 - Assignment 1: Falling Object](#1---assignment-1-falling-object)
  - [Question](#question)
  - [Solution](#solution)
- [2 - Assignment 2 - Wage Calculator](#2---assignment-2---wage-calculator)
  - [Question](#question-1)
  - [Solution](#solution-1)

# 1 - Assignment 1: Falling Object

## Question

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

## Solution

```java
class FallingObject{
  public static void main(String[] args){
    double initialVelocity = 0.0;
    double initialPosition = 0.0;
    double g = -9.8;
    double time = 10.0;
    double position;
    position = 0.5 * g * time * time + initialVelocity * time + initialPosition;
    System.out.println("The position of the object at " + time + " seconds is " + position + "m.");
  }
}
```

[Downlaod Solution](FallingObject.java)

# 2 - Assignment 2 - Wage Calculator

## Question

Write a method that calculates the weekly wage of an employee. The method should take as input the number of hours worked and the hourly wage, and return the total wage.

- If the number of hours worked is greater than 40, the employee is paid 1.5 times the hourly wage for the extra hours.
- The maximum number of hours worked is 60.
- The hourly wage is at least $8.00 an hour.

**Specifications**:

- Name the method `computeWage`
- input: `int hours`, `double wage`
- output: no return value and print the result

**Reminders**:

- to convert a `int` to a `String`, use one of the following:
  - `String s = "" + 5;`
  - `String s = Integer.toString(5);`
- to convert a `String` to an `int` use one of the following:
  - `int x = Integer.parseInt("5");`
- do not call `==` on `double` values

## Solution

```
Solution will be posted a day before the next class
```

[Downlaod Solution](WageCalculator.java)

[**Return to Main Page**](index)
