---
title: 4 - Classes and Objects
permalink: /lectures/classes_objects/
---

## 4.0 Table of Contents<!-- omit from toc -->

- [4.1 Session 3 Review](#41-session-3-review)
  - [4.1.1 Solution to Assignment 3](#411-solution-to-assignment-3)
  - [4.1.2 Frequent Error #1](#412-frequent-error-1)
  - [4.1.3 Frequent Error #2](#413-frequent-error-2)
  - [4.1.4 Frequent Error #3](#414-frequent-error-3)
  - [4.1.5 Frequent Error #4](#415-frequent-error-4)
  - [4.1.6 Frequent Error #5](#416-frequent-error-5)
  - [4.1.7 Debugging Tip #1](#417-debugging-tip-1)
  - [4.1.8 Debugging Tip #2](#418-debugging-tip-2)
- [4.2 Object Oriented Programming](#42-object-oriented-programming)
  - [4.3 Why use `class`es?](#43-why-use-classes)
- [4.4 Defining a Class](#44-defining-a-class)
  - [4.4.1 Overview](#441-overview)
    - [Class Definition](#class-definition)
    - [Class Instantiation](#class-instantiation)
  - [4.4.2 Note on Creating Classes](#442-note-on-creating-classes)
  - [4.4.3 Class Fields](#443-class-fields)
  - [4.4.4 Instantiate a Baby](#444-instantiate-a-baby)
  - [4.4.5 Constructors](#445-constructors)
  - [4.4.6 Methods](#446-methods)
- [4.5 Using Classes](#45-using-classes)
  - [4.5.1 Classes and Instances](#451-classes-and-instances)
  - [4.5.2 Accessing Fields](#452-accessing-fields)
  - [4.5.3 Calling Methods](#453-calling-methods)
- [4.6 References vs Values](#46-references-vs-values)
  - [4.6.1 Primitive vs Reference](#461-primitive-vs-reference)
  - [4.6.2 Storing Primitive Values](#462-storing-primitive-values)
  - [4.6.3 Storing Reference Values](#463-storing-reference-values)
  - [4.6.4 References](#464-references)
- [4.7 Static Types and Methods](#47-static-types-and-methods)
  - [4.7.1 Static](#471-static)
  - [4.7.2 Static Fields](#472-static-fields)
  - [4.7.3 Static Methods](#473-static-methods)
  - [4.7.4 Why is main static?](#474-why-is-main-static)
- [4.8 Assignment 4 - Library](#48-assignment-4---library)
  - [Problem](#problem)
  - [Step 1: Implement the `Book` class](#step-1-implement-the-book-class)
  - [Step 2: Implement the `Library` class](#step-2-implement-the-library-class)
  - [`Book.java`](#bookjava)
  - [`Library.java`](#libraryjava)

## 4.1 Session 3 Review

### 4.1.1 Solution to Assignment 3

[View Solution](/homework#assignment-3-marathon-runners)

### 4.1.2 Frequent Error #1

Array Index vs Array Value

```java
int[] values = {99,100,101};
System.out.println(values[0]); // 99
```

```text
values:  99 100 101
indices: 0  1   2
```

### 4.1.3 Frequent Error #2

Curly braces `{}` after `if`/`else`/`for`/`while` statements

what does this print?

```java
for (int i = 0; i < 10; i++)
    System.out.println(i);
    System.out.println("Done");
```

### 4.1.4 Frequent Error #3

Variable initialization

```java
int getMinValue(int[] values){
    int min = 0;
    for (int i = 0; i < values.length; i++){
        if (values[i] < min)
            min = values[i];
    }
    return min;
}
```

- What if `vals = {0,1,2}`?
- set `min = values[0]` or `min = Integer.MAX_VALUE` instead

### 4.1.5 Frequent Error #4

Variable Initialization - Part 2

```java
int minIdx = getMinValue(values);
int secondIdx = 0;
for (int i = 0; i < values.length; i++){
    if (values[i] < values[minIdx])
        secondIdx = i;
}
```

- What if `vals = {0,1,2}`?
- see solutions

### 4.1.6 Frequent Error #5

Defining a method inside a method

```java
public static void main(String[] args){
    public static void findMin(int[] values){
        // ...
    }
}
```

### 4.1.7 Debugging Tip #1

Use `System.out.println()` to print out values of variables

```java
for (int i = 0; i < values.length; i++){
    System.out.println("i: " + i);
    System.out.println("values[i]: " + values[i]);
    if (values[i] < values[minIdx])
        secondIdx = i;
}
```

### 4.1.8 Debugging Tip #2

Format your code

This is rather hard to read:

```java
for (int i = 0; i < values.length; i++){if (values[i] < values[minIdx])
{  secondIdx = i;}return secondIdx;
}
```

## 4.2 Object Oriented Programming

- it is representative of the real world

```text
Baby:
    name
    gender
    age
    weight
    height
```

- it is a blueprint for creating objects
- objects group together data and methods
- data: attributes
- methods: behaviors

```java
Baby:
    String name
    boolean isBoy
    int age
    double weight
    double height
```

### 4.3 Why use `class`es?

- why not just use variables?

```java
// baby alex
String nameAlex;
double weightAlex;
// baby david
String nameDavid;
double weightDavid;
```

- what if another baby is also named Alex?
- what there are 100 babies?

```text
Baby1:
    Name
    Weight
    gender
    ...

Baby2:
    Name
    Weight
    gender
    ...

Baby3:
    Name
    Weight
    gender
    ...

Baby4:
    Name
    Weight
    gender
    ...

...

Baby100:
    Name
    Weight
    gender
    ...
```

Then we can place all the babies into an array:

```text

Nursery:
    Baby1
    Baby2
    Baby3
    Baby4
    ...
    Baby100
```

We can also add nurses to the nursery:

```text
Nursery:
    Baby1
    Baby2
    Baby3
    Baby4
    ...
    Baby100

    Nurse1
    Nurse2
    Nurse3
    Nurse4
    ...
    Nurse100
```

We can also place the nursery into a hospital:

```text
Hospital:
    Nursery
        Nurse[]
        Baby[]
    EmergencyRoom
        Nurse[]
        Patient[]
```

## 4.4 Defining a Class

### 4.4.1 Overview

#### Class Definition

```java
public class Baby{
    String name;
    boolean isBoy;
    double weight;
    double height;
    int age;

    void cry(){
        System.out.println("Waaaaaah!");
    }

    void eat(){
        weight += 0.1;
    }

    void updateAge(){
        age++;
    }
}
```

#### Class Instantiation

```java
Baby alex = new Baby();
```

### 4.4.2 Note on Creating Classes

- class names are capitalized
- 1 class per file
- have a `main` method means the class is executable

### 4.4.3 Class Fields

- fields are variables that belong to a class

```java
public class Baby{
    TYPE var_name;
    TYPE var_name = some_value;
}
```

- `TYPE` can be any data type

```java
public class Baby{
    String name;
    boolean isBoy;
    double weight;
    double height;
    int age = 0;
}
```

- add a sibilings field to the `Baby` class

```java
public class Baby{
    String name;
    boolean isBoy;
    double weight;
    double height;
    int age = 0;
    Baby[] siblings;
}
```

### 4.4.4 Instantiate a Baby

```java
Baby alex = new Baby();
```

- `new` keyword creates a new object
- to assign values to the fields, create constructors to initialize the fields

### 4.4.5 Constructors

- a constructor is a special method that is called when an object is created
- it is used to initialize the fields of the object

```java
public class CLASSNAME{
    CLASSNAME(){
        // initialize fields
    }

    CLASSNAME([ARGUMENTS]){
        // initialize fields
    }
}

CLASSNAME obj1 = new CLASSNAME();
CLASSNAME obj2 = new CLASSNAME([ARGUMENTS]);
```

- constructors have the same name as the class
- no return type because it never returns anything
- it is usually used to initialize the fields of the object
- all classes must have at least one constructor
- if no constructor is defined, then the compiler will create a default constructor

```java
CLASSNAME(){}
```

```java
public class Baby{
    String name;
    boolean isBoy;

    Baby(String myname, boolean boy){
        name = myname;
        isBoy = boy;
    }
}
```

### 4.4.6 Methods

- they are used to perform operations on the fields of the class
- they are defined inside the class

```java
public class Baby{
    String name;
    void sayName(){
        System.out.println("My name is " + name);
    }
}
```

```java
public class Baby{
    double weight;

    void eat(double foodWeight){
        if (foodWeight > 0 && foodWeight < weight)
            weight += foodWeight;
    }
}
```

## 4.5 Using Classes

### 4.5.1 Classes and Instances

```java
// class Definition
public class Baby {...}

// class Instances
Baby alex = new Baby("Alex", true);
Baby anna = new Baby("Anna", false);
```

### 4.5.2 Accessing Fields

`Object.field`

```java
Baby alex = new Baby("Alex", true);

// access fields
System.out.println(alex.name);
System.out.println(alex.isBoy);
```

### 4.5.3 Calling Methods

`Object.method([ARGUEMENTS])`

```java
Baby alex = new Baby("Alex", true);
alex.sayName();
alex.eat(0.1);
```

## 4.6 References vs Values

### 4.6.1 Primitive vs Reference

- primitive types are basic java types
- int, double, boolean, char, etc.
- the actual value is stored in the variable

- Reference types are objects and arrays
- String, Baby, int[], etc.

### 4.6.2 Storing Primitive Values

- in Java, variables are like fixed size cups
- primitives are small enough to fit in the cup

### 4.6.3 Storing Reference Values

- reference types are too big to fit in the cup
- hence they are stored somewhere else
- the variable stores the address of the object

### 4.6.4 References

- the object's address/location is called a reference
- `==` compares the references

would `alex1 == alex2` be true or false?

```java
Baby alex1 = new Baby("Alex", true);
Baby alex2 = new Baby("Alex", true);
```

They would **not** be the same

```text
alex1: reference1
alex2: reference2

reference1 stored at 0x1234:
    name: "Alex"
    isBoy: true

reference2 stored at 0x5678:
    name: "Alex"
    isBoy: true
```

- use `=` updates the reference

```java
Baby alex1 = new Baby("Alex", true);
Baby alex2 = new Baby("Alex", true);
alex1 = alex2;
```

```text
alex1: reference2
alex2: reference2
```

What is i, j, and k?

```java
void doSomething(int x, int[] y, Baby b){
    x=99;
    y[0]=99;
    b.name = "99";
}
...

int i = 0;
int[] j = {0};
Baby k = new Baby("0", true);
doSomething(i,j,k);
```

## 4.7 Static Types and Methods

### 4.7.1 Static

- Applies to fields and methods
- means that the field/method
  - belongs to the class
  - not unique to each instance

### 4.7.2 Static Fields

```java
public class Baby{
    static int numBabies = 0;
    String name;

    Baby(String myname){
        name = myname;
        numBabies++;
    }
}

...
Baby alex = new Baby("Alex");
Baby anna = new Baby("Anna");
```

What is the value of `alex.numBabies` and `anna.numBabies`?

- `2` and `2`
- `numBabies` is a static field
- there is only one copy of it
- the value is shared by all instances of the class

### 4.7.3 Static Methods

```java
public class Baby{
    static void cry(Baby thisBaby){
        System.out.println(thisBaby.name + " cries");
    }
}

public class Baby{
    void cry(){
        System.out.println(name + " cries");
    }
}

```

- Non-static methods can reference static methods, but not the other way around
- Static methods can only reference static methods

Why?

```java
public class Baby {
    String name = "alex";
    static void whoami(){
        System.out.println(name);
    }
}
```

- `whoami` cannot access `name` because `name` is not static, therefore it unique to each instance of the class, and `whoami` does not know which instance of `name` to access

### 4.7.4 Why is main static?

- main is static because it is the entry point of the program
- it is the first method that is called
- there is no instance of the class yet
- hence it must be static

## 4.8 Assignment 4 - Library

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

#### Note<!-- omit from toc -->

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

[View Solution](/homework#assignment-4-library)

[**Return to Top**](#40-table-of-contents)

[**Return to Main Page**](index)
