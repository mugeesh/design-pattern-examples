<!-- PROJECT LOGO -->
<br />
<p align="left">
<p align="left"><h2>Design Pattern:</h2>
<p><b>*Design patterns</b> are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.  </p>
<h2>What does the pattern consist of?</h2>
<p>Most patterns are described very formally so people can reproduce them in many contexts. Here are the sections that are usually present in a pattern description:</p>
<p><b>Intent</b> of the pattern briefly describes both the problem and the solution.</p>
<p><b>Motivation</b> further explains the problem and the solution the pattern makes possible.</p>
<p><b>Structure</b> of classes shows each part of the pattern and how they are related.</p>
<p><b>Code</b> example in one of the popular programming languages makes it easier to grasp the idea behind the pattern.</p>
<h2></h2><p>
In addition, all patterns can be categorized by their intent, or purpose. There are three main groups of patterns: <br/>
<p><b>Creational patterns</b> provide object creation mechanisms that increase flexibility and reuse of existing code.</p>
<p><b>Structural patterns</b> explain how to assemble objects and classes into larger structures, while keeping the structures flexible and efficient.<p>
<p><b>Behavioral patterns</b> take care of effective communication and the assignment of responsibilities between objects.</p>
</p>

<h2>This repository contains all examples of design pattern along with code and reference:</h2>
<h4>Design pattern are mainly categories  into 3 category.</h4>
</p>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
    <a href="#creation-design-pattern">Creation Design Pattern</a>
      <ul>
        <li><a href="#factory">Factory Design Pattern</a></li>
        <li><a href="#absfactory">Abstract Factory Design Pattern</a></li>
        <li><a href="#singleton">Singleton Design Pattern</a></li>
        <li><a href="#prototype">Prototype Design Pattern</a></li>
        <li><a href="#builder">Builder Design Pattern</a></li>
        <li><a href="#pool">Object Pool</a></li>
      </ul>
    </li>
    <li>
      <a href="#structural">Structural Design Pattern</a>
      <ul>
        <li><a href="#adapter">Adapter Design Pattern</a></li>
        <li><a href="#bridge">Bridge Design Pattern</a></li>
        <li><a href="#decorator">Composite Design Pattern</a></li>
        <li><a href="#bridge">Decorator Design Pattern</a></li>
        <li><a href="#facade">Facade Design Pattern</a></li>
        <li><a href="#flyweight">FlyWeight Design Pattern</a></li>
        <li><a href="#bridge">Bridge Design Pattern</a></li>
        <li><a href="#proxy">Proxy Design Pattern</a></li>
      </ul>
    </li>
   <li>
      <a href="#behaviour">Behaviour  Design Pattern</a>
      <ul>
        <li><a href="#chain">Chain Of Responsibilities Design Pattern</a></li>
        <li><a href="#command">Command Design Pattern</a></li>
        <li><a href="#interpreter">Interpreter Design Pattern</a></li>
        <li><a href="#iterator">Iterator Design Pattern</a></li>
        <li><a href="#mediator">Mediator Design Pattern</a></li>
        <li><a href="#momento">Momento Design Pattern</a></li>
        <li><a href="#observer">Observer Design Pattern</a></li>
        <li><a href="#mediator">Mediator Design Pattern</a></li>
        <li><a href="#state-design-pattern">State Design Pattern</a>
        <li><a href="#strategy-design-pattern">Strategy Design Pattern</a></li>
        <li><a href="#template-design-pattern">Template Design Pattern</a></li>
        <li><a href="#visitor-design-pattern">Visitor Design Pattern</a></li>
      </ul>
    </li>
  </ol>
</details>
 
## Creation Design Pattern

### creation2

### factory

### absfactory


### singleton

### prototype

### builder

### pool


### structural


### adapter


### bridge
### facade
### composite

### decorator

### flyweight
### proxy


### behaviour

### chain

### command

### interpreter


### iterator

### mediator

### momento


### observer

## State Design Pattern
**Definition :** State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.
  * This is all about composition.
  * In this code example, we are changing the state of ATMMachine using its state(object)<br/>
**This Context:** Maintains an instance of a ConcreteState subclass that defines the current state.<br/>
**State:** Defines interface for declaring what each concrete state should do.<br/>
**ConcreteState:** Provides implementation for methods defined in State.<br/>


## Strategy Design Pattern
**Definition :** Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.</br>Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter.<br>
**Java Example** One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.<br><br>

**Strategy Design Pattern Important Points** 
- We could have used composition to create instance variable for strategies but we should avoid that as we want the specific strategy to be applied for a particular task. Same is followed in **Collections.sort()** and **Arrays.sort()** method that take comparator as argument.<br>
- Strategy Pattern is very similar to <a href="#state-design-pattern">State Pattern</a> One of the difference is that Context contains state as instance variable and there can be multiple tasks whose implementation can be dependent on the state whereas in strategy pattern strategy is passed as argument to the method and context object doesn’t have any variable to store it.<br>
- Strategy pattern is useful when we have multiple algorithms for specific task and we want our application to be flexible to chose any of the algorithm at runtime for specific task.<br>



## Template Design Pattern
**Definition :** Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.
- Template method design pattern is to define an algorithm as a skeleton of operations and leave the details to be implemented by the child classes.
- Used to create a group of subclass that have to execute a similar group of methods.
- you create an abstract class that contains a method called the Template Method.
- The Template Method contains a series of method calls that every subclass object will call.
- The subclass objects can override some of the method calls.
- **note** To make sure that subclasses don’t override the template method, **we should make it final.**
  
  **Benefits:** 
- It is very common technique for reusing the code.This is only the main benefit of it.



## Visitor Design Pattern
**Definition :** It is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.

The visitor pattern consists of two parts:

- a method called **Visit()** which is implemented by the visitor and is called for every element in the data structure
- visitable classes providing **Accept()** methods that accept a visitor

**Advantages :**
- If the logic of operation changes, then we need to make change only in the visitor implementation rather than doing it in all the item classes.
- Adding a new item to the system is easy, it will require change only in visitor interface and implementation and existing item classes will not be affected.

**Disadvantages :**

- We should know the return type of visit() methods at the time of designing otherwise we will have to change the interface and all of its implementations.
- If there are too many implementations of visitor interface, it makes it hard to extend.


<!-- CONTACT -->
## Contact

Your Name - [mugeesh](https://hk.linkedin.com/in/mugeesh) - mugeesh.husain@gmail.com

Project Link: [https://github.com/mugeeshh/design-pattern-examples](https://github.com/mugeeshh/design-pattern-examples)

