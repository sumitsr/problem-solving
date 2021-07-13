package com.problemsolving.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class StringSegmentationDP {

  public static boolean canSegmentString(String s, Set<String> dictionary, int[] lookup) {
    int n = s.length();
    if (n == 0)
      return true;

    // if the sub-problem is seen for the first time
    if (lookup[n] == -1) {
      // mark sub-problem as seen (0 initially assuming string can't be segmented)
      lookup[n] = 0;

      for (int i = 1; i <= n; i++) {
        String prefix = s.substring(0, i);

        // if the prefix is found in the dictionary, then recur for the suffix
        if (dictionary.contains(prefix) && canSegmentString(s.substring(i), dictionary, lookup)) {
          lookup[n] = 1;
          return true;
        }
      }
    }
    // return solution to the current sub-problem
    return lookup[n] == 1;
  }

  public static void main(String[] args) {
    Set<String> dictionary = new HashSet<>();
    String s = new String();
    s = "hellonow";

    dictionary.add("hello");
    dictionary.add("hell");
    dictionary.add("on");
    dictionary.add("now");

    int[] lookup = new int[s.length() + 1];
    Arrays.fill(lookup, -1);

    if (canSegmentString(s, dictionary, lookup)) {
      System.out.println("String Can be Segmented");
    } else {
      System.out.println("String Can NOT be Segmented");
    }
  }
}