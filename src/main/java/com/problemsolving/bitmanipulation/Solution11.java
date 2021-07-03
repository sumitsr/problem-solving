package com.problemsolving.bitmanipulation;

class Solution11 {

    public static int hammingDistance(int a, int b) {
        int xor = a ^ b;
        int distance = 0;

        while (xor != 0) {
            if (xor % 2 == 1) {
                distance += 1;
            }
            xor >>= 1;
        }

        return distance;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        System.out.println("Hamming Distance between two integers is " + hammingDistance(a, b));
    }
}