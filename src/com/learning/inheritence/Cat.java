package com.learning.inheritence;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat Eating");
    }
    public void display() {
        System.out.println("I am a cat");
    }
    public void catMethod() {
        System.out.println("Cat Method");
    }

}
