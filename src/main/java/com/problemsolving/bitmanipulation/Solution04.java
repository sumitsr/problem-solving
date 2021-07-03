package com.problemsolving.bitmanipulation;

import java.util.Arrays;

class Solution04 {
    private static String[] checkEvenOdd(int[] nums) {
        String[] ans = new String[nums.length];

        int k = 0;
        for (int n : nums) {
            ans[k++] = ((n & 1) == 1) ? "Odd" : "Even"; 
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(checkEvenOdd(nums)));
    }
}