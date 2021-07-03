package com.problemsolving.bitmanipulation;

class CountDigits {
    /**
     * Time complexity: O(n)
     *
     * The run time depends on the number of digits in n. In the worst case, it iterates through all the digits until it becomes 0.
     *
     * Space complexity: O(1)
     *
     * The space complexity is O(1) since no additional space is allocated.
     */
    private static int countDigits(int n){
        int count = 0;
        
        while (n > 0) {
            count++;
            n /= 10;
        }
        
        return count;
    }

    private static int countDigitsRecursive(int n) {
        // base checks
        if (n == 0) {
            return 0;
        }

        return (1 + countDigitsRecursive(n / 10));
    }

    public static void main(String[] args) {
        int number = 125;
        System.out.println("Number of digits : " + countDigits(number));
    }
}