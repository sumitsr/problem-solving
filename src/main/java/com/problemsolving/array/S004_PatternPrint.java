package com.problemsolving.array;

import java.util.ArrayList;

public class S004_PatternPrint {
    public static ArrayList<ArrayList<Integer>> solve(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int count = 1;
        while (count <= n) {
            ans.add(getList(count));
            count++;
        }
        return ans;
    }
 
    private static ArrayList<Integer> getList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        while (count <= size) {
            list.add(count);
            count++;
        }
        return list;
    }
 
    public static void main(String[] args) {
        System.out.println(solve(4));
    }
}
