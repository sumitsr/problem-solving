package com.problemsolving.array;

class S012_RotateArray {
    public static void rightRotateArrayByOnePostion(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }

    public static void leftRotateArrayByOnePosition(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }

    public static int[] rightRotateArrayByKPositions(int[] arr, int k) {
        // if rotation is greater than size of array
        int n = arr.length;
        k = k % n;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < k) {
                result[i] = arr[n + i - k];
            } else {
                result[i] = arr[i - k];
            }
        }
        return result;
    }

    public static int[] leftRotateArrayByKPositions(int[] arr, int k) {
        // if rotation is greater than size of array
        int n = arr.length;
        k = k % n;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }
        return result;
    }

    public static void main(String args[]) {
        int[] arr = {3, 6, 1, 8, 4, 2};
        System.out.print("Array before rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr = rightRotateArrayByKPositions(arr, 3);
        System.out.print("Array after rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

} 