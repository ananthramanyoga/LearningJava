package com.learning;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class TestTryCatch {
    public static void main(String[] args) throws Exception {
        Integer ab = new Integer(5);
        int c = 50;

        int c1 = takeNumber(c);
        Integer ab1 = takeNumber(ab);
        System.out.println("The value is :" + ab1);
        System.out.println("The value is :" + c1);

    }
    public static int takeNumber(int i) throws Exception {
        int c = 0;
        try {
            c = takeNumber1(i);
        } catch(IOException e) {
            System.out.println("Handled the IOException and rethrowing it");
            throw new Exception("Some Message as needed by the feature",e);
        }
        c = takeNumber1(i);
        return c;
    }

    public static Integer takeNumber1(int i) throws IOException {
        try (FileReader fr = new FileReader("")) {
            Student s = null;
            s.setAge(0);
            return i;
        }
//        finally {
//            fr.close();
//            //throw new NumberFormatException();
//            //return i;
//        }


    }
}
