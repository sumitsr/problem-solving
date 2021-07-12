package com.problemsolving.hashtables;

import java.util.HashMap;

class CheckPair {

  public static String findPair(int[] arr) {

    String result = "";

    HashMap<Integer,int[]> hMap = new HashMap<>();

    for (int i = 0; i < arr.length; ++i) {
      for (int j = i + 1; j < arr.length; ++j) {
        int sum = arr[i] + arr[j]; //calculate sum

        if (!hMap.containsKey(sum)) {
          // If sum is not present in Map then insert it alongwith pair
          hMap.put(sum, new int[] {arr[i],arr[j]});
        }
        else {
          //Sum already present in Map
          int[] prev_pair = hMap.get(sum);

          // Since array elements are distinct, we don't
          // need to check if any element is common among pairs
          result += "{" + prev_pair[0] + "," + prev_pair[1] + "}{" + arr[i] + "," + arr[j] + "}";

          return result;
        }
      }
    }//end of for
    return result;
  }
  
  public static void main(String args[]) {
   
     int[] arr = {3, 4, 7, 1, 12, 9};
     System.out.println(findPair(arr));
    
  }
}