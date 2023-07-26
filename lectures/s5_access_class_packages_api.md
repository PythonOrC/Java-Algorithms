---
title: 5 - Access Control, class scope, packages, and the API
permalink: /lectures/access_class_packages_api/
---

## 5.0 Table of Contents<!-- omit from toc -->

- [5.1 Session 4 Review](#51-session-4-review)
  - [5.1.1 Classes](#511-classes)
  - [5.1.2 Solution to Assignment 4](#512-solution-to-assignment-4)
- [5.2 Access Control](#52-access-control)
  - [5.2.1 Potential Loopholes](#521-potential-loopholes)
  - [5.2.2 Access Modifiers](#522-access-modifiers)
  - [5.2.3 Improved BankAccount](#523-improved-bankaccount)
  - [5.2.4 Why Access Control?](#524-why-access-control)
- [5.3 Class Scope](#53-class-scope)
  - [5.3.1 Scope Review](#531-scope-review)
  - [5.3.2 Scope](#532-scope)
  - [5.3.3 `this` Keyword](#533-this-keyword)
- [5.4 Packages](#54-packages)
  - [5.4.1 Packages Overview](#541-packages-overview)
  - [5.4.2 Defining Packages](#542-defining-packages)
  - [5.4.3 Using Packages](#543-using-packages)
  - [5.4.3 Why Packages?](#543-why-packages)
  - [5.4.4 Special Packages](#544-special-packages)
- [5.5 Java API](#55-java-api)
  - [5.5.1 Java API Overview](#551-java-api-overview)
  - [5.5.2 Arrays with items](#552-arrays-with-items)
  - [5.5.3 ArrayList](#553-arraylist)
  - [5.5.4 Sets](#554-sets)
  - [5.5.5 Maps](#555-maps)
  - [5.5.6 Warnings](#556-warnings)

## 5.1 Session 4 Review

### 5.1.1 Classes

```java
    public class Counter{
        int myCount;            // fields: instance variable  (non-static)
        static int ourCount;    // fields: class variable (static)

        void increment(){       // methods: instance method (non-static)
            myCount++;
            ourCount++;
        }

        public static void main(String[] args){
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            c1.increment();
            c1.increment()
            c2.increment();
            System.out.println("Counter 1: " + c1.myCount + " " + c1.ourCount);
            System.out.println("Counter 2: " + c2.myCount + " " + c2.ourCount);
        }
    }
```

```java
Counter c1 = new Counter();
Counter c2 = new Counter();
```

```text
ourCount = 0

c1:
    myCount = 0
c2:
    myCount = 0
```

---

```java
c1.increment();
```

```text
ourCount = 1

c1:
    myCount = 1
c2:
    myCount = 0
```

---

```java
c1.increment();
```

```text
ourCount = 2

c1:
    myCount = 2
c2:
    myCount = 0
```

```java
c2.increment();
```

---

```text
ourCount = 3

c1:
    myCount = 2
c2:
    myCount = 1
```

### 5.1.2 Solution to Assignment 4

[View Solution](/homework#assignment-4-library)

## 5.2 Access Control

### 5.2.1 Potential Loopholes

```java
public class BankAccount {
    String accountNumber;
    double balance;

    void charge(double amount){
        balance -= amount;
    }

    String getCardNumber(String password){
        if(password.equals("Secret!Password")){
            return accountNumber;
        } else {
            return "Invalid Password";
        }
    }
}
```

Now if someone wants to maliciously change the balance of an account, they can simply edit the balance directly.

```java
public class MalicousCode {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.accountNumber = "123456789";
        account.balance = 1000000;
        System.out.println(account.balance);
    }
}
```

### 5.2.2 Access Modifiers

- `public`: accessible to all classes anywhere
- `private`: accessible only to the class itself

these two modifiers can be applied to both fields and methods

### 5.2.3 Improved BankAccount

```java
public class BankAccount {
    private String accountNumber;
    private double balance;

    public void charge(double amount){
        balance -= amount;
    }

    public String getCardNumber(String password){
        if(password.equals("Secret!Password")){
            return accountNumber;
        } else {
            return "Invalid Password";
        }
    }
}
```

### 5.2.4 Why Access Control?

- protect private information
- prevent accidental misuse and clarify how to use a class
- keep implementation details hidden

## 5.3 Class Scope

### 5.3.1 Scope Review

```java

public class ScopeReview {
    private int z;
    void scopeMethod(int x){
        z = x;
        String y;
        if (x > 0){
            y = "positive";
        } else {
            y = "negative or 0";
        }
        System.out.println("y = " + y);
    }
}
```

```java
pbulic class ScopeReview{
    private int z;
    void scopeMethod(int x){
        z=x;
        String var;
        if (x > 0){
            y = "positive";
        } else {
            y = "negative or 0";
        }
        System.out.println("y = " + y);
    }
}
```

### 5.3.2 Scope

- just like methods, variables are accessible only within the `{}` they are declared in

- Previous lessons: methods level scope

  - ```java
    void method(int arg1){
        int arg2 = arg1 + 1;
    }
    ```

- This lesson: class level scope

  - ```java
    class Example{
        int field1;
        void setVal(int newVal){
            field1 += newVal;
        }
    }
    ```

### 5.3.3 `this` Keyword

In this case, only method-level `servings` will be updated

```java
public class Baby{
    int servings;
    void feed(int servings) {
        servings += servings;
    }
}
```

- `this` keyword clarifieds scope
- means "my object"

Usage:

```java
class Example{
    int field1;
    void setVal(int newVal){
        this.field1 += newVal;
    }
}
```

Now object-level `servings` is updated instead of the method-level

```java
public class Baby{
    int servings;
    void feed(int servings) {
        this.servings += servings;
    }
}
```

## 5.4 Packages

### 5.4.1 Packages Overview

- Each class belongs to a package
- classes in the same package serve a similar purpose
- packages are just directories (folders)
- classes in other packages need to be imported

### 5.4.2 Defining Packages

```java
package path.to.package;

class className{
    // class code
}
```

### 5.4.3 Using Packages

```java
import path.to.package.className;
import path.to.package.*;
```

```java
package parenttools;

public class BabyFood{
    // class code
}
```

```java
package parenttools;
public class Baby{
    // class code
}
```

```java
package adult;

import parenttools.Baby;
import parenttools.BabyFood;

public class Parent{
    public static void main(String[] args){
        Baby baby = new Baby();
        BabyFood food = new BabyFood();
    }
}
```

### 5.4.3 Why Packages?

- Combine similar functionality
  - org.town.libraries.Book
  - org.town.libraries.Kibrary
- Separate similar names
  - shopping.List
  - packing.List

### 5.4.4 Special Packages

- All classes "see classes" in the same package (no import is needed)
- all classes "see" classes in the `java.lang` package (no import is needed)
  - java.lang.String
  - java.lang.System

## 5.5 Java API

### 5.5.1 Java API Overview

Java includes lots of packages/classes and they can be reysed to avoid extra work.

<https://docs.oracle.com/javase/8/docs/api/>

### 5.5.2 Arrays with items

- create the array bigger than you need
- track the next "avaiable" slot

```java
Book[] books = new Book[10];
int nextIdx = 0;

books[nextIdx] = b;
nextIdx++;
```

Now what if the library needs to expand dynamically?

### 5.5.3 ArrayList

- ArrayList is a class in the `java.util` package
- is is a modifiable list
- internally implomented as an array

Features

- get/put items by index
- add items
- delete items
- loop over all items

Arrays

```java
Book[] books = new Book[10];
int nextIdx = 0;

books[nextIdx] = b;
nextIdx++;
```

ArrayList

```java
ArrayList<Book> books = new ArrayList<Book>();
books.add(b);
```

```java
import java.util.ArrayList;

class ArrayListExample {
    public static void main (String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam");
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println(strings.get(l));
        strings.set(0, "Goodbye");
        strings.remove(l);
        for (int i = 0; i < strings.size(); i++) {
            System. out. println(strings .get (i));
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }
}

```

### 5.5.4 Sets

Like an ArrayList but

- can only hold one copy of each object
- no array index

Features

- add object to the set
- remove object from the set
- check if object is in the set

TreeSet: Sorted (lowest to highest)
HashSet: Unordered

```java
import java.util.TreeSet;

class SetExample {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<String>();
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam");
        System.out.println(strings.size());
        System.out.println(strings.first());
        System.out.println(strings.last());
        strings.remove("Eugene");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
```

### 5.5.5 Maps

- Store a (key, value) pair of objects
- look up the value by key

Example: Address Book

- a map of names to email addresses

TreeMap: Sorted (by key, lowest to highest)
HashMap: Unordered

```java
public static void main(String[] args) {
    HashMap<String, String> strings = new HashMap<String, String>();
    strings.put("Evan", "emaill@mit.edu");
    strings.put("Eugene", "emai12@mit.edu");
    strings.put("Adam", "emai13@mit.edu");
    System.out.println(strings.size());
    strings.remove("Evan");
    System.out.println(strings.get("Eugene"));
    for (String s : strings.keySet()) {
        System.out.println(s);
    }
    for (String s : strings.values()) {
        System.out.println(s);
    }
    for (Map.Entry<String, String> pairs : strings.entrySet()) {
        System.out.println(pairs);
    }
}
```

### 5.5.6 Warnings

- If you wish to use TreeSet, HashSet, HashMap, or TreeMap, you must import them.
- If you wish to use TreeSet/TreeMap
  - read able the `Comparable` interface
- If you wish to use HashSet/HashMap
  - read about the `equals` and `hashCode` method

[**Return to Top**](#50-table-of-contents)

[**Return to Main Page**](index)
