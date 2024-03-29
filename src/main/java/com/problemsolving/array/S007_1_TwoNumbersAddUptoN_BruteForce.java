package com.problemsolving.array;

class S007_1_TwoNumbersAddUptoN_BruteForce {

    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2]; // to store the pair of values.

        for (int i = 0; i < arr.length; i++) { //traverse arr
            for (int j = i + 1; j < arr.length; j++) { //traverse arr again
                if (arr[i] + arr[j] == n) { // find where sum is equal to n
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result; // return the pair of numbers
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {

        int n = 9;
        int[] arr1 = {2, 4, 5, 7, 8};
        if (arr1.length > 0) {
            int[] arr2 = findSum(arr1, n);
            int num1 = arr2[0];
            int num2 = arr2[1];

            if ((num1 + num2) != n)
                System.out.println("Not Found");
            else {
                System.out.println("Number 1 = " + num1);
                System.out.println("Number 2 = " + num2);
                System.out.println("Sum = " + (n));

            }
        } else {
            System.out.println("Input Array is Empty!");
        }
    }
}