package com.problemsolving.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public static ArrayList<Integer> solve(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
 
        for (int i: list) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
 
        for (int i: list) {
            if (i < secondHighest) {
                ans.add(i);
            }
        }
        return ans;
    }
 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(391, 634, 740, 441, 75, 444, 65, 611, 679, 59, 878, 102, 42, 190, 801, 571, 79, 686, 523, 580, 199, 497, 879, 334, 200, 202, 991, 341, 479, 563, 112, 550, 494, 468, 56, 644, 53, 581, 836, 461, 905, 849, 838, 434, 818, 350, 585, 280, 252, 834, 510, 420, 395, 776, 118, 886, 19, 809, 534, 143, 933, 15, 999, 514, 230, 531, 666, 841, 861, 703, 972, 622, 640, 21, 811, 476, 751, 430, 308, 996, 165, 812, 424, 412, 903, 601, 226, 239, 728, 135));
        System.out.println(solve(list));
    }
}
