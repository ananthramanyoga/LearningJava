package com.learning;

import java.util.HashMap;
import java.util.Map;

public class TestJava {
    public static void main(String args[]) {
//        String s = "abc@gmail.com";
//        boolean abc = true;
//        boolean emailMatch = s.matches("^([a-z]+[\\+\\.]*)@([a-z]+[\\.]*)\\.[com]+$");
//        System.out.println(emailMatch);
        //System.out.println(getContent(abc, null));
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("1", 100);
        myMap.put("2", 200);
        for(Map.Entry entry : myMap.entrySet()) {
            entry.setValue((Integer) entry.getValue() + 1000);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for(String key : myMap.keySet()) {
            myMap.put(key, myMap.get(key) + 2000);
            System.out.println(key + " : " + myMap.get(key));
        }
    }
    public static String getContent(boolean abc, String s) {
        String content = null;
        try {
            if (abc) {
                content = "true";
                System.out.println(s.substring(0));
            } else {
                content = "false";
            }
        } catch (Exception e) {
            content = "Exception";
        }
        return content;
    }
}
