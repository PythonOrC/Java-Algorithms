---
title: Assignments
permalink: /homework/
---

# 0 - Table of Contents<!-- omit from toc -->

- [Assignment 1: Falling Object](#assignment-1-falling-object)
  - [Question](#question)
  - [Solution](#solution)
- [Assignment 2: Wage Calculator](#assignment-2-wage-calculator)
  - [Question](#question-1)
  - [Solution](#solution-1)
- [Assignment 3: Marathon Runners](#assignment-3-marathon-runners)
  - [Question](#question-2)
  - [Solution](#solution-2)

# Assignment 1: Falling Object

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

# Assignment 2: Wage Calculator

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

```java
class WageCalculator {

    public static void calculateWage(double hourlyWage, int hours) {
        if (hourlyWage < 15.0) {
            System.out.println("You must be paid at least $15.00/hour.");
        } else if (hours > 60) {
            System.out.println("You cannot work more than 60 hours in a week.");
        } else {
            double wage = 0.0;
            if (hours > 40) {
                wage = 40 * hourlyWage + (hours - 40) * hourlyWage * 1.5;
            } else {
                wage = hours * hourlyWage;
            }
            System.out.println("You earned $" + wage + " this week.");
        }
    }

    public static void main(String[] args) {
        calculateWage(9.99, 50);
        calculateWage(15.00, 50);
        calculateWage(25.00, 63);
    }
}
```

[Downlaod Solution](WageCalculator.java)

# Assignment 3: Marathon Runners

## Question

A group of students decided to run in a Marathon. Their names and finishing times are given below. Write a program that print out the name of the fastest runner.

| Name     | Time (minutes) |
| -------- | -------------- |
| Elena    | 341            |
| Thomas   | 273            |
| Hamilton | 278            |
| Suzie    | 329            |
| Phil     | 445            |
| Matt     | 402            |
| Alex     | 388            |
| Emma     | 275            |
| John     | 243            |
| James    | 334            |
| Jane     | 412            |
| Emily    | 393            |
| Daniel   | 299            |
| Neda     | 343            |
| Aaron    | 317            |
| Kate     | 265            |

**Specifications**

- Write a method that takes as input an array of integers and returns the index corresponding to the person with the lowest time. Run this method on the array of `times`. Print out the `name` and `time` corresponding to the returned index.

- Write a second method to find the second-best runner. The second method should use the first method to determine the best runner, and then loop through all values to find the second-best (second lowest) time.

**Program Skeleton**

```java
class Marathon {
    public static void main (String[] args) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        // call method to find the index of the fastest runner
        // print out the name and time of the fastest runner
        int fastestIndex = findFastestRunner(times);
        System.out.println("Fastest runner: " + names[fastestIndex] + " (" + times[fastestIndex] + " minutes)");

        // call method to find the index of the second-best runner
        // print out the name and time of the second-best runner
        int secondBestIndex = findSecondBestRunner(times);
        System.out.println("Second-best runner: " + names[secondBestIndex] + " (" + times[secondBestIndex] + " minutes)");
    }
}

```

## Solution

```
Solutions will be posted a day before the class, but you can click on the link below to see a hint.
```

[Downlaod Solution](MarathonRunners.java)

[**Return to Top**](#0---table-of-contents)

[**Return to Main Page**](index)
