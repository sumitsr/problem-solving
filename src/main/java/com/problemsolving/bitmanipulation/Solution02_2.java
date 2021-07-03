package com.problemsolving.bitmanipulation;

import java.util.Arrays;
import java.util.Stack;

class Solution02_2 {
    private static String helper(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            int remainder = n % 2; // remainder gives either 0 OR 1
            stack.push(remainder); // store the remainder value in stack
            n >>= 1; // this is equivalent to n = n/2;
        }
        
        //loggers
        for (String s : Arrays.asList("while loop breaks only when \"number\" terminates to : " + n, "  ")) {
            System.out.println(s);
        }

        int[] bits = new int[stack.size()];
        int k = 0;

        while (!stack.isEmpty()) {
            //each bit is popped and stored in array of intgers
            bits[k++] = stack.pop();
        }

        return Arrays.toString(bits);
    }

     public static void main(String[] args) {
        int number = 125;
        System.out.println("Binary representaion of number : \"" + number + "\" is : " + helper(number));
    }
}