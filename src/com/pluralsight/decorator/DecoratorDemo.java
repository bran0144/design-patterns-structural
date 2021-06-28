package com.pluralsight.decorator;

//Also called a wrapper
//Adds behavior without affecting others (if you want)
//more than just inheritance
//Single responsibility principle (every class should have responsibility over a single function)
//that responsibility should be entirely encapsulated by the class
//Compose behavior dynamically
//Utilizes composition and inheritance
//Alternative to sublassing
//Compoenent, ConcreteComponent, Decorator, ConcreteDecorator
//Avoids having to create concrete objects for every feature we want to implement

//Problems:
//need to build a new class for every new feature
//multiple little specialized objects
//often confused with simple inheritance


public class DecoratorDemo {
    public static void main(String args[]) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }

}
