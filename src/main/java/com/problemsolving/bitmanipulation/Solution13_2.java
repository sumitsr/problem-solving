package com.problemsolving.bitmanipulation;

class Solution13_2 {
    private static int helper(int[] nums) {
        int n = nums.length + 1;
        int res = 0;

        for (int i = 0; i < n; i++) {
            res ^= i;
        }

        for (int value : nums) {
            res ^= value;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing element in the array is " + helper(nums));
    }
}