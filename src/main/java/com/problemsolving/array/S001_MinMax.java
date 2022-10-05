package com.problemsolving.array;

import java.util.ArrayList;
import java.util.Arrays;

public class S001_MinMax {
    public static int solve(ArrayList<Integer> list) {
        int ans = 0;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
 
        // find smallest and greatest elements
        for (int i: list) {
            mini = Math.min(mini, i);
            maxi = Math.max(maxi, i);
        }
 
        // count the required elements
        for (int i: list) {
            if (mini < i && maxi > i) {
                ans += 1;
            }
        }
        return ans;
    }
 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3));
        System.out.println(solve(list));
    }
}
