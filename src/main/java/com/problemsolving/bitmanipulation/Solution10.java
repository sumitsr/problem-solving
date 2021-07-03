package com.problemsolving.bitmanipulation;

class Solution10 {
    private static String oppositeSigns(int x, int y) {
        return (x ^ y) < 0 ? "Signs are opposite" : "Signs are not opposite";
    }

    public static void main(String[] args) {
        int x = 100, y = -1;
        System.out.println("For inputs " + x + ", " + y + " : " + oppositeSigns(x, y));

        int z = 100, p = 501;
        System.out.println("For inputs " + z + ", " + p + " : " + oppositeSigns(z, p));
    }
}