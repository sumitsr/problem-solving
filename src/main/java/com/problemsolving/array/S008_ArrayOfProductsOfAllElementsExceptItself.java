package com.problemsolving.array;

class S008_ArrayOfProductsOfAllElementsExceptItself {
    public static int[] findProduct(int arr[]) {
        int[] result = new int[arr.length];

        int temp = 1;

        // Product of elements from left side excluding arr[i]
        for (int i = 0; i < arr.length; i++) {
            result[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] *= temp;    // multiply the value of temp here as this will ensure that all elemets of result array are products of elements to the right and the left of the original element.
            temp *= arr[i];
        }

        return result;
    }

    public static String arrayToString(int arr[]) {
        if (arr.length > 0) {
            String result = "";
            for (int j : arr) {
                result += j + " ";
            }
            return result;
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String args[]) {

//        int[] arr = {-1, 2, -3, 4, -5};
        int[] arr = {1, 2, 3, 4};

        System.out.println("Array before product: " + arrayToString(arr));

        int[] prodArray = findProduct(arr);

        System.out.println("Array after product: " + arrayToString(prodArray));
    }
} 