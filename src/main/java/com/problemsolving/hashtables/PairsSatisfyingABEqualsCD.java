package com.problemsolving.hashtables;

import java.util.HashMap;

class PairsSatisfyingABEqualsCD {

    public static void findPairs(int arr[], int n) {

        boolean found = false;
        HashMap<Integer, pair> hp = new HashMap<Integer, pair>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // If product of pair is not in hash table, then store it
                int prod = arr[i] * arr[j];

                if (!hp.containsKey(prod))
                    hp.put(prod, new pair(i, j));

                    // If product of pair is available in then print current and previous pair
                else {
                    pair p = hp.get(prod);
                    System.out.println(arr[p.first] + " " + arr[p.second] + " " + "and" + " " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        // If no pair found then print not found
        if (found == false)
            System.out.println("No pairs Found");
    }

    ;

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        findPairs(arr, n);
    }

    static class pair {

        int first, second;

        pair(int f, int s) {
            first = f;
            second = s;
        }
    }
}
