# Difference-Arrays-ArrayLists

This project demonstrates the differences between **arrays** and **ArrayList** in Java.

## Arrays vs. ArrayList

In Java, both arrays and 'ArrayList' are used to store multiple values, but they behave differently.  

An **array** has a fixed size. You decide how many elements it can hold when you create it, and that number cannot change. Arrays can store both primitive types (like 'int' or 'double') and objects. They are fast and efficient, making them useful when the number of items is known in advance.  

An **'ArrayList<E>'** is resizable. Its size grows or shrinks as you add or remove elements, which makes it more flexible than an array. 'ArrayList' stores objects only, so when working with numbers, wrapper classes like 'Integer' are used instead of 'int'. It also provides convenient methods such as 'add', 'remove', 'get', and 'contains' to simplify common operations.  

**Key differences:**  
- Array - fixed size, stores primitives or objects, efficient.  
- ArrayList - dynamic size, stores objects only, provides built-in methods.  

## References

Bloch, J. (2018). *Effective Java* (3rd ed.). Addison-Wesley.  
Oracle. (n.d.). *Java SE API Specification*. https://docs.oracle.com/javase/  
