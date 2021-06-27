package com.problemsolving.array;

class Solution13 {

    //Re-Arrange Positive and Negative Values of Given Array
    public static void reArrange(int arr[]) {

        int[] newArray = new int[arr.length];
        int newArray_index = 0;

        //Fill newArray with Negative Values first.
        //Then Fill it with Postive Values.
        //In the end, insert every element of newArray back into origional arr.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                newArray[newArray_index++] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0)
                newArray[newArray_index++] = arr[i];
        }

        for (int j = 0; j < newArray_index; j++) {
            arr[j] = newArray[j];
        }
    }

    public static void reArrangeInPlace(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {   // if negative number found
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j]; // swapping with leftmost positive
                    arr[j] = temp;
                }
                j++;
            }
        }
    } //end of reArrange()

    public static void main(String args[]) {

        int[] arr = {2, 4, -6, 8, -5, -10};

        System.out.print("Array before re-arranging: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        reArrange(arr);

        System.out.print("Array after rearranging: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}