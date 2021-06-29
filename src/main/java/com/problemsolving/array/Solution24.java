package com.problemsolving.array;

import java.util.Arrays;

class Solution24 {
    /*
     * Steps to implement Quick sort:
     *
     * 1) Choose an element, called pivot, from the list. Generally pivot can be the middle index element.
     * 2) Reorder the list so that all elements with values less than the pivot come before the pivot, while
     *    all elements with values greater than the pivot come after it (equal values can go either way).
     *    After this partitioning, the pivot is in its final position. This is called the partition operation.
     * 3) Recursively apply the above steps to the sub-list of elements with smaller values and separately the
     *    sub-list of elements with greater values.
     */
    private static void doQuickSort(int[] input, int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = input[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapNumbers(i, j, input);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            doQuickSort(input, lowerIndex, j);
        if (i < higherIndex)
            doQuickSort(input, i, higherIndex);
    }

    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /*
     *
     * Quicksort or partition-exchange sort, is a fast sorting algorithm, which is using divide and conquer algorithm.
     * Quicksort first divides a large list into two smaller sub-lists: the low elements and the high elements.
     * Quicksort can then recursively sort the sub-lists.
     *
     * The complexity of quick sort in the average case is Θ(n log(n)) and in the worst case is Θ(n^2).
     *
     */
    public static void doQuickSort(int[] input) {

        if (input == null || input.length == 0) {
            return;
        }
        int length = input.length;
        doQuickSort(input, 0, length - 1);
    }

    public static void main(String[] args) {
        int[] a = new int[]{55, 23, 26, 2, 18, 78, 23, 8, 2, 3};

        System.out.print("Before Sorting\n");
        System.out.print(Arrays.toString(a) + "\n");

        doQuickSort(a);

        System.out.print("After Sorting\n");
        System.out.print(Arrays.toString(a));
    }
}  