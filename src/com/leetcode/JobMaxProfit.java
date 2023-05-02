package com.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JobMaxProfit {
        // maximum number of jobs are 50000
        static int memo[] = new int[50001];

        private static int findNextJob(int[] startTime, int lastEndingTime) {
            int start = 0, end = startTime.length - 1, nextIndex = startTime.length;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (startTime[mid] >= lastEndingTime) {
                    nextIndex = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return nextIndex;
        }

        private static int findMaxProfit(List<List<Integer>> jobs, int[] startTime) {
            int length = startTime.length;

            for (int position = length - 1; position >= 0; position--) {
                // it is the profit made by scheduling the current job
                int currProfit = 0;

                // nextIndex is the index of next non-conflicting job
                int nextIndex = findNextJob(startTime, jobs.get(position).get(1));

                // if there is a non-conflicting job possible add it's profit
                // else just consider the curent job profit
                if (nextIndex != length) {
                    currProfit = jobs.get(position).get(2) + memo[nextIndex];
                } else {
                    currProfit = jobs.get(position).get(2);
                }

                // storing the maximum profit we can achieve by scheduling
                // non - conflicting jobs from index position to the end of array
                if (position == length - 1) {
                    memo[position] = currProfit;
                } else {
                    memo[position] = Math.max(currProfit, memo[position + 1]);
                }
            }

            return memo[0];
        }

        public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
            List<List<Integer>> jobs = new ArrayList<>();

            // storing job's details into one list
            // this will help in sorting the jobs while maintaining the other parameters
            int length = profit.length;
            for (int i = 0; i < length; i++) {
                ArrayList<Integer> currJob = new ArrayList<>();
                currJob.add(startTime[i]);
                currJob.add(endTime[i]);
                currJob.add(profit[i]);

                jobs.add(currJob);
            }

            jobs.sort(Comparator.comparingInt(a -> a.get(0)));

            // binary search will be used in startTime so store it as separate list
            for (int i = 0; i < length; i++) {
                startTime[i] = jobs.get(i).get(0);
            }

            return findMaxProfit(jobs, startTime);
        }

        public static void main(String[] args){
            int[] startTime = {1,2,3,3};
            int[] endTime = {3,4,5,6};
            int[] profit = {50,10,40,70};
            int a = jobScheduling(startTime, endTime, profit);
        }
}
