---
title: Assignments
permalink: /homework/
---

# 0 - Table of Contents<!-- omit from toc -->

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

## Solution

```
Solution will be posted a day before the next class
```

[Downlaod Solution](WageCalculator.java)

[**Return to Top**](#0---table-of-contents)

[**Return to Main Page**](index)
