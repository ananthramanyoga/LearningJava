package com.leetcode;

import java.util.Arrays;

public class AvgSalaryExclMinMax {
    public static void main(String args[]) {
        int[] a = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        int min=a[0], max=a[0];
        double avg = 0;
        for(int i =0; i<a.length;i++) {
            min = Math.min(min, a[i]);
            max = Math.max(max,a[i]);
            avg +=a[i];
        }
        avg = (avg - min - max)/(a.length-2);
        System.out.println(avg);

        System.out.println(countOdds(3,7));
        System.out.println(average(a));


    }
    public static double average(int[] salary) {
        double avg = 0.0;
        Arrays.sort(salary);
        System.out.println(salary.toString());
        for(int i = 1; i < salary.length -1; i++) {
            System.out.print(salary[i] + ", ");
            avg += salary[i];
        }
        System.out.println("");
        return avg/(salary.length-2);
    }

    public static int countOdds(int low, int high) {
        if(low % 2 == 0) {
            low++;
        }
        return low > high ? 0 : ((high-low)/2) + 1;
    }
}
