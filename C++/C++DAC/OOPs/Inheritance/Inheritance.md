# Inheritance

1. Inheritance is fundamental concept in OOP. It is the mechanism by which one class is allowed to inherit the features (feilds and methods) of another class. Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse teh methods and feilds of that class.

## How Inheritance Works in C++
* The colon **(:)** with an access specifier is used for inheritance in **C++**. It allows the derived class (child class) to inherit the data members (feilds) and member function (methods) of the base class (parent class).
* When a class inherits another class, it get all the accessible memebers of the parent class, and the child class can also redefine (override) or add new functionality to them.

## Types of Inheritance
1. **Single Inheritance** -> A sub-class is derived from only one super class. It inherit the properties and behavior of a single parent class. sometimes, it is also known as simple inheritance.

2. **Multiple Inheritance** -> One class can have more that one superclass and inherit features from all parent classes.

3. **Multilevel Inheritance** -> Multilevel Inheritance in C++ means a class is derived from another class, forming a chain of inheritance.

4. **Hierarchical Inheritance** -> In hierarchical inheritance, more than one subclass is inherited from a single base class. i.e. moore than one derived class is created from a single base class. 

5. **Hybrid Inheritance** -> When two or more types of inheritance are combined in one program. For example, a class might use multiple inheritance and also be part of a multilevel inheritance chain.




## Advantages of Inheritance in C++
* Code Reusability
* Abstraction
* Class Hierarchy
* Polymorphism

## Disadvantages of Inheritance in C++
* Tight Coupling
* Reduced Flexibility
* Increased Complexity
* Diamond Problem
* Overhead of Virtual Functions

