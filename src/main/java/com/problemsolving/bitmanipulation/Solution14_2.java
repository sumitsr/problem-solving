package com.problemsolving.bitmanipulation;

class Solution14_2 {
    public static boolean checkKthBitSet(int n, int k) {
        // return (n & (1 << (k - 1))) != 0; this is using left shift
        return ((n >> (k - 1)) & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println("n = 5, k = 3 : " + checkKthBitSet(5, 3));
        System.out.println("------------");
        System.out.println("n = 10, k = 2 : " + checkKthBitSet(10, 2));
        System.out.println("------------");
        System.out.println("n = 10, k = 1 : " + checkKthBitSet(10, 1));
    }
}