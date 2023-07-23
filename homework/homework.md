---
title: Assignments
permalink: /homework/
---

## 0 - Table of Contents<!-- omit from toc -->

- [Assignment 1: Falling Object](#assignment-1-falling-object)
  - [Question](#question)
  - [Solution](#solution)
- [Assignment 2: Wage Calculator](#assignment-2-wage-calculator)
  - [Question](#question-1)
  - [Solution](#solution-1)
- [Assignment 3: Marathon Runners](#assignment-3-marathon-runners)
  - [Question](#question-2)
  - [Solution](#solution-2)
- [Assignment 4 - Library](#assignment-4---library)
  - [Problem](#problem)
  - [Step 1: Implement the `Book` class](#step-1-implement-the-book-class)
  - [Step 2: Implement the `Library` class](#step-2-implement-the-library-class)
    - [Note](#note)
  - [`Book.java`](#bookjava)
  - [`Library.java`](#libraryjava)
  - [Solution](#solution-3)

## Assignment 1: Falling Object

### Question

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

### Solution

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

## Assignment 2: Wage Calculator

### Question

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

### Solution

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

## Assignment 3: Marathon Runners

### Question

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

### Solution

```java
class MarathonRunners {

    // method to find the index of the fastest runner
    public static int findFastestRunner(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < values.length; i++)

            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        return minIndex;
    }

    // method to find the index of the second-best runner
    public static int findSecondBestRunner(int[] values) {
        int secondIdx = -1;
        int minIdx = findFastestRunner(values);
        for (int i = 0; i < values.length; i++) {
            if (i == minIdx)
                continue;
            if (secondIdx == -1 ||
                    values[i] < values[secondIdx])
                secondIdx = i;

        }

        return secondIdx;

    }

    public static void main(String[] args) {
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
        System.out
                .println("Second-best runner: " + names[secondBestIndex] + " (" + times[secondBestIndex] + " minutes)");
    }
}
```

[Downlaod Solution](MarathonRunners.java)

## Assignment 4 - Library

### Problem

You are in charge of creating an electronic library system for a small town. The town has two libraries, each with a collection of books for borrow. Customers can print the list of available books, borrow a book, and return a book.

two classes are provided for you: `Book` and `Library`. You must implement the missing methods to make the classes work.

### Step 1: Implement the `Book` class

First a class needs to model books. Copy and paste the skeleton code for `Book.java` into a file called `Book.java`. This class defines methods to get the title of a book, find out if it is available, borrow the book, and return the book. The skeleton the methods are provided, but you must implement the methods. The `main` method can be used to test the code. When you run `Book.java`, the output should be the following:

```text
Title (should be The Da Vinci Code): The Da Vinci Code
Rented? (should be false): false
Rented? (should be true): true
Rented? (should be false): false
```

_Hint_: Look at the main method to see how the methods are used, then fill in the code for each method.

### Step 2: Implement the `Library` class

Next a class needs to model a library to manage the books. All libraries have the same hours: 9AM to 5PM everyday. However, they have different addresses and book collections (arrays of `Book` objects).

Copy and paste the skeleton code for `Library.java` into a file called `Library.java`. The `main` method procided creates two libraries, then performs some operations on the books. However, the methods and variables are not implemented. Define and implement those. Read the `main` method and look and compile erros to figure out what methods are missing.

#### Note

- some methods will need to be `static`, and some needs to be `instance` methods
- careful with comparing `String` objects as they are reference types and can only be compared using `.equals()` (`String1.equals(String2)`)
- Try to get a small part of the code working at a time, then move on to the next part. You can start by commenting the entire `main` method, then uncommenting one line at a time. Run the program and get the first lines working before uncommenting the next line. You can usually comment/uncomment lines of code by selecting the lines and pressing `Ctrl + /` (Windows) or `Cmd + /` (Mac). You cancomment a block of code in Eclipse by selecting the code, then choosing Source → Toggle Comment. Do the same again to uncomment it.
- You must not modify the `main` method.

The output of `Library.java` when you run it should be the following:

```text
Library hours:
Libraries are open daily from 9am to 5pm.

Library addresses:
10 Main St.
228 Liberty St.

Borrowing The Lord of the Rings:
You successfully borrowed The Lord of the Rings
Sorry, this book is already borrowed.
Sorry, this book is not in our catalog.

Books available in the first library:
The Da Vinci Code
Le Petit Prince
A Tale of Two Cities

Books available in the second library:
No book in catalog

Returning The Lord of the Rings:
You successfully returned The Lord of the Rings

Books available in the first library:
The Da Vinci Code
Le Petit Prince
A Tale of Two Cities
The Lord of the Rings
```

### `Book.java`

```java
public class Book {
    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
    }

    // Returns the title of the book
    public String getTitle() {
        // Implement this method
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
```

[Download File](/homework/Book.java)

### `Library.java`

```java
public class Library {
    // Add the missing implementation to this class

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
```

[Download File](/homework/Library.java)

### Solution

```java
Solution
```

[Downlaod Solution (Book.java)](BookSolution.java)

[Downlaod Solution (Library.java)](BookSolution.java)

[**Return to Top**](#0---table-of-contents)

[**Return to Main Page**](index)
