package com.problemsolving.bitmanipulation;

class Solution14 {
    private static boolean checkKthBitSet(int n, int k) {
        return (n & (1 << (k - 1))) != 0;
    }

    public static void main(String[] args) {
        System.out.println("n = 5, k = 3 : " + checkKthBitSet(5, 3));
        System.out.println("------------");
        System.out.println("n = 10, k = 2 : " + checkKthBitSet(10, 2));
        System.out.println("------------");
        System.out.println("n = 10, k = 1 : " + checkKthBitSet(10, 1));
    }
}