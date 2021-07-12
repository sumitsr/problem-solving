package com.problemsolving.hashtables;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckSubArrayZero {

    static ArrayList<Pair> findSubArrays(int[] arr, int n) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // to store sub-array
        ArrayList<Pair> subArrayList = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0)
                subArrayList.add(new Pair(0, i));
            // to store list of indexes against a sum
            ArrayList<Integer> al = new ArrayList<>();

            if (map.containsKey(sum)) {
                al = map.get(sum);
                for (int it = 0; it < al.size(); it++) {
                    subArrayList.add(new Pair(al.get(it) + 1, i));
                }
            }
            al.add(i);
            map.put(sum, al);
        }
        return subArrayList;
    }

    static void print(ArrayList<Pair> out) {
        for (int i = 0; i < out.size(); i++) {
            Pair p = out.get(i);
            System.out.println("Subarray found from Index "
                    + p.startIndex + " to " + p.endIndex);
        }
    }

    public static void main(String args[]) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n = arr.length;

        ArrayList<Pair> out = findSubArrays(arr, n);

        if (out.size() == 0)
            System.out.println("No subarray exists");
        else
            print(out);
    }

    static class Pair {
        int startIndex, endIndex;

        Pair(int a, int b) {
            startIndex = a;
            endIndex = b;
        }
    }
}
