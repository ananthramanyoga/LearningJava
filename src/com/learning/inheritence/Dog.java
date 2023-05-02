package com.learning.inheritence;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }

    public void dogMethod() {
        System.out.println("Dog Method");
    }
}
