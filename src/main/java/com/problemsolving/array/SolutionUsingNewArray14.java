package com.problemsolving.array;

class SolutionUsingNewArray14 {

    public static void maxMin(int[] arr) {
        //Create a result array to hold re-arranged version of given arr
        int[] result = new int[arr.length];

        int pointerSmall = 0;     //PointerSmall => Start of arr
        int pointerLarge = arr.length - 1;   //PointerLarge => End of arr

        //Flag which will help in switching between two pointers
        boolean switchPointer = true;

        for (int i = 0; i < arr.length; i++) {
            if (switchPointer)
                result[i] = arr[pointerLarge--]; // copy large values
            else
                result[i] = arr[pointerSmall++]; // copy small values

            switchPointer = !switchPointer;   // switching between samll and large
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = result[j];    // copying to original array
        }
    }

    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Array before min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        maxMin(arr);

        System.out.print("Array after min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}