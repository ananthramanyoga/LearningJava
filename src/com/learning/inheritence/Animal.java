package com.learning.inheritence;

public abstract class Animal {
    public abstract void makeNoise();
    public void eat() {
        System.out.println("Eating");
    }
    public void print() {
        System.out.println("I am an animal");
    }

    public void animalMethod() {
        System.out.println("Animal Method");
    }
}
