package com.problemsolving.bitmanipulation;

class Solution12 {
    private static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 9, 1, 4, 2};
        System.out.println("Element appearing one time is " + singleNumber(nums));
    }
}