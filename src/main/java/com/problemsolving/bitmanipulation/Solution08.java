package com.problemsolving.bitmanipulation;

class Solution08 {
    public static void main(String[] args) {

        int a = 10, b = 121;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("Finally, after swapping; a = " + a + " , b = " + b);
    }
}