package com.learning.inheritence;

import java.util.ArrayList;
import java.util.List;

public class TestInheritence {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Animal d1 = new Dog();
        Animal c1 = new Cat();
        //doSomething(d);
        //doSomething(c);
//        doSomething(d);
//        doSomething(c);
//        doSomething(d1);
//        doSomething(c1);
//        d.print();
//        d1.print();
//        c.display();
        System.out.println("abc");
        List<Animal> arr = new ArrayList<>();
        arr.add(d);
        arr.add(c);
        arr.add(d1);
        arr.add(c1);
        for(Animal animal : arr) {

        }
//        for(int i =0; i<arr.size(); i++) {
//            Animal a = arr.get(i);
//            a.makeNoise();
//        }
    }
//    public static void doSomething(Dog d) {
//        d.eat();
//        d.makeNoise();
//    }
//    public static void doSomething(Cat c) {
//        c.eat();
//        c.makeNoise();
//    }
    public static void doSomething(Animal a) {
        a.eat();
        a.makeNoise();
    }
}
