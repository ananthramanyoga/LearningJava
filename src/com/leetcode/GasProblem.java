package com.leetcode;

public class GasProblem {
    public static void main(String args[]) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int canComplete = canCompleteCircuit(gas,cost);
        System.out.println(canComplete);

    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int remainingGas = 0;
        int total = 0;
        int start = 0;
        for(int i = 0; i<=gas.length; i++) {
            remainingGas += gas[i];
            total += gas[i]-cost[i];
            if(remainingGas < cost[i]) {
                start = i + 1;
                remainingGas=0;
            } else {
                remainingGas -= cost[i];
            }
        }
        if(total >=0) {
            return start;
        }
        return -1;
    }
}
