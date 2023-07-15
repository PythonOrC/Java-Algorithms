---
title: Assignments
permalink: /homework/
---

# 0 - Table of Contents

- [0 - Table of Contents](#0---table-of-contents)
- [1 - Homework 1: Falling Object](#1---homework-1-falling-object)
  - [Question:](#question)
  - [Solution](#solution)

# 1 - Homework 1: Falling Object

## Question:

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

[**Return to Main Page**](index)
