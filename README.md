# From Book Java Design Patterns

![Untitled](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXrk8pAXeYLFAB12icHqYByVqzy0CyQVZpHg&usqp=CAU)

# Solid Principle

The SOLID principles are not rules. They are not laws. They are not perfect truths. They are statements on the order of “An apple a day keeps the doctor away.” This is a good principle, it is good advice, but it’s not a pure truth, nor is it a rule.

## Single Responsibility Principle

Changes in one method can impact the other related method(s) in the class. This is why the single responsibility principle opposes this idea of putting multiple responsibilities in a class. It says that a class should have only one reason to change.

Note that the SRP does not say that a class should have at most one method. Here the emphasis is on the single responsibility. For example, if you have different methods to display the first name, the last name, and a full name, you can put these methods in the same class. These methods are closely related, and it makes sense to place all these display methods inside the same class.

## Open/Closed Principle

*The Open-Closed Principle (OCP) was coined in 1988 by* Bertrand Meyer*. It says: **A software artifact should be open for extension but closed for modification.***

**Open**

A module is said to be open if it is still available for extension. For example, it should be possible to expand its set of operations or add fields to its data structures.

**Closed**

A module is said to be closed if it is available for use by other modules. This assumes that the module has been given a well-defined, stable description (its interface in the sense of information hiding). At the implementation level, closure for a module also implies that you may compile it, perhaps store it in a library, and make it available for others (its clients) to use.

Once you create a class and other parts of your application start using it, any further change in the class can cause the working application to break. If you require new features (or functionalities), **instead of changing the existing class, you can extend it to adopt the new requirements**. What is the benefit? Since you do not change the old code, your existing functionalities continue to work without any problems, and you can avoid testing them again. Instead, you test the “extended” part (or functionalities) only.

## Liskov Substitution Principle

The LSP says that you should be able to substitute a parent (or base) type with a subtype.

## Interface Segregation Principle

You often see a fat interface that contains many methods. A class that implements the interface may not need all these methods. It suggests that you don’t pollute an interface with these unnecessary methods only to support one (or some) of the implementing classes of this interface. The idea is that a client should not depend on a method that it does not use

## Dependency Inversion Principle

The DIP covers two important things:

- A high-level concrete class should not depend on a low-level concrete class. Instead, both should depend on abstractions.
- Abstractions should not depend upon details. Instead, the details should depend upon abstractions.