package com.learning.inheritence;

import com.learning.Student;

public class TestEquality {
    public static void main(String args[]){
        Student s1 = new Student("Saranya", 35);
        Student a1 = new Student("Ananth", 38);
        Student a2 = new Student("Ananth", 38);
        Student s2 = s1;
        if(s1 == s2) {
            System.out.println("S1 is equal to S2");
        } else {
            System.out.println("S1 is NOT equal to S2");
        }

        if(a1 == a2) {
            System.out.println("a1 is equal to a2");
        } else {
            System.out.println("a1 is NOT equal to a2");
        }


        System.out.println("----------");

        if(s1.equals(s2)) {
            System.out.println("S1 OBJ is equal to S2 OBJ");
        } else {
            System.out.println("S1 OBJ is NOT equal to S2 OBJ");
        }

        if(a1.equals(a2)) {
            System.out.println("a1 OBJ is equal to a2 OBJ");
        } else {
            System.out.println("a1 OBJ is NOT equal to a2 OBJ");
        }
    }
}
