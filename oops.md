INHERITANCE
Inheritance allows us to create a new class from an existing class.
  -  The new class which is created is known as subclass(child or derived class).
  -  The existing class from where the child  class is derived is called as superclass(parent class or base class).
  -  Extends keyword is used in java.
  -  It is only used when their exists an is-a relationship b/w two classes.
  -  Super keyword is used to call the method of the parent class from the method of  child class.
  -  THE MAIN IMPORTANCE OF INHERITANCE IN JAVA IS CODE REUSABILITY.
  -  WE CAN ACHIEVE POLYMORPHISM IN JAVA WITH THE HELP OF INHERITANCE.
 
 TYPES OF INHERITANCE:
 - Single inheritance
 - Multilevel inheritance
 - Hierarchical inheritance
 - Multiple inheritance
 - Hybrid inheritance




POLYMORPHISM
 - Polymorphism simply means many forms or more than one form.
 - Same entity(methods or operator or object) can perform different operations in different scenarios.
 
 
 
 
 ABSTRACTION
 -  Data abstraction is a property by  virtue of which only the esssential details are displayed to the user.
 -  It is achived by interfaces and abstract classes.
 -  An abstract class is a type of class which can have abstract as well as regular methods.

 ENCAPSULATION
 -  Data encapsulation is a property of hiding data attributes and their behaviours in a single unit.
 -  It helps devs to follow modularity ehile developing software by ensureing that each object is independent of other objects
    by having its own methods , attributes
 -  It is used for the security of private properties of an object and hence serves the purpose of data hiding.
 
 
 INTERFACES
 -  In java interface specifies the behaviour of a class by providing an abstract type.
 -  Interface is a fully abstract class (methods without a body).
 -  Like abstract classes  interfaces, we cannot create objects of interfaces.
 -  Implements keyword is used to implement interfaces in java.
 -  Similar to classes interfaces can extend other interfaces.
 
 
 SUPER KEYWORD
 - Super keyword refers to super class (parent objects).
 - It is used to call superclass methods, and to access the superclass constructor.
 - THE MOST COMMON USE OF SUPERCLASS IS TO ELIMINATE THE CONFUSION BETWEEN SUPERCLASSES AND SUBCALASSES THAT HAVE SAME METHOD NAMES.


 ENUMS
 - An enum is a special class that represents group of constants(unchangeble variables ,like final variable)
 - Enum keyword is used to create enums.


 INSTANCE VARIABLE
 - Instance variables are the variables that are accesible by all the methods in the class.
 - They are declared outside the methods and inside the class.
 - These variables describes the property of an object
 
 LOCAL VARIABLE
 - Local variables are the varibles that are present inside constructors , methods , functions and can be accesed only inside them.


 METHOD OVERRIDING
 - If subclass (child class) has same method as declared in parent class, it is known as method overriding in java.
 - Method overriding is used for runtime polymorphism.

 METHOD OVERLOADING
 - Method overloading is a form of polymorphism in OOP. Polymorphism allows objects or methods    to act in different ways, according to the means in which they are used. 


 MULTITHREADING
 - Multithreading in Java is a process of executing multiple threads simultaneously.
 - A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.


 CONSTRUCTORS
- Default Constructor: In Java, a default constructor is the one which does not take any inputs. In other words, default constructors are the no argument constructors   which will be created by default in case you no other constructor is defined by the user. Its main purpose is to initialize the instance variables with the default      values. Also, it is majorly used for object creation. 
- Parameterized Constructor: The parameterized constructor in Java, is the constructor which is capable of initializing the instance variables with the provided values. In other words, the constructors which take the arguments are called parameterized constructors.


 ABSTRACT CLASS
 - An abstract class is a special class containing abstract methods. 
 - The significance of abstract class is that the abstract methods inside it are not implemented and only declared.
 - So as a result, when a subclass inherits the abstract class and needs to use its abstract methods, they need to define and implement them.

 
 
 
