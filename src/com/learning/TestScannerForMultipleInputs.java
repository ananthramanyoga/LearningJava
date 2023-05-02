package com.learning;

import java.util.Scanner;

public class TestScannerForMultipleInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = 0;
            for(int j=0; j<n; j++) {
                for(int k=0; k<=j; k++) {
                    sum = sum + (power(2, k) * b);
                }
                sum = sum + a;
                System.out.print(sum + " ");
                sum = 0;
            }
        }
        in.close();
    }
    public static int power(int c, int k) {
        int e = 1;
        while(k > 0) {
            e *= c;
            k--;
        }
        return e;
    }
}
