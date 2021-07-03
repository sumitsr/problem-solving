package com.problemsolving.bitmanipulation;

class Solution05 {
    public static void main(String[] args) {
        System.out.println(helper(6));
        System.out.println(helper(8));
    }

    /**
     * Return boolean(even/odd) for the given number.
     *
     * @param n
     * @return
     */
    private static boolean helper(int n) {
        return n != 0 && (n & (n - 1)) == 0;
    }
}