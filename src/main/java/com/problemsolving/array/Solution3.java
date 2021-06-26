package com.problemsolving.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {
    public static int solve(ArrayList<Integer> list) {
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
 
 
        for (int i: list) {
            if (i%2 == 0) {
                maxEven = Math.max(maxEven, i);
            } else {
                minOdd = Math.min(minOdd, i);
            }
        }
        return maxEven - minOdd;
    }
 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3));
        System.out.println(solve(list));
    }
}
