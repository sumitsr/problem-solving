package com.problemsolving.bitmanipulation;

class Solution02_1 {
    private static int helper(int n) {
        int count = 0;
        while (n > 0) {
            ++count;
            n >>= 1; // this is equivalent to (n = n >> 1) OR (n = n/2);
        }
        return count;
    }

     public static void main(String[] args) {
        int number = 125;
        System.out.println("Number of bits : " + helper(number));
    }
}