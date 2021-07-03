package com.problemsolving.bitmanipulation;

class Solution02_3 {
    private static int helper(int n) {
        int bitsCounter = 0;

        while ((1 << bitsCounter) <= n) {
            bitsCounter += 1;
        }

        return bitsCounter;
    }

    public static void main(String[] args) {
        int number = 125;
        System.out.println("Number of bits : " + helper(number));
    }
}