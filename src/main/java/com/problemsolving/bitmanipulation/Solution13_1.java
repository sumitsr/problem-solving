package com.problemsolving.bitmanipulation;

class Solution13_1 {
    private static int helper(int[] nums) {
        int n = nums.length;
        int expectedSum = ((n * (n + 1)) / 2);

        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing element in the array is " + helper(nums));
    }
}