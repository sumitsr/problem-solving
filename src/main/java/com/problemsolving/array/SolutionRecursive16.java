package com.problemsolving.array;

class SolutionRecursive16 {
    static int binarySearchRec(int[] a, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (a[mid] == key) {
            return mid;
        } else if (key < a[mid]) {
            return binarySearchRec(a, key, low, mid - 1);
        } else {
            return binarySearchRec(a, key, mid + 1, high);
        }
    }

    static int binSearch(int[] a, int key) {
        return binarySearchRec(a, key, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
        int[] inputs = {10, 49, 99, 110, 176};

        for (int i = 0; i < inputs.length; i++) {
            System.out.println("binSearch(arr, " + inputs[i] + ") = " + binSearch(arr, inputs[i]));
        }
    }
}