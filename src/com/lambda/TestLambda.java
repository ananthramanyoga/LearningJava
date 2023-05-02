package com.lambda;

public class TestLambda {

    public static void main(String[] args) {
        //IAddable<String> stringAdder = new IAddableImpl();

        IAddable<Integer> stringAdder = (Integer s1, Integer s2) -> (s1 * s2);


//        IAddable<String> stringAdder = new IAddable<String>() {
//
//            @Override
//            public String add(String t1, String t2) {
//                return null;
//            }
//        };
        System.out.println("The added String is: " + stringAdder.add(1, 5));
    }
}
