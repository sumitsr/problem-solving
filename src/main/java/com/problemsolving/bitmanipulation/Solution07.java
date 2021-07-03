package com.problemsolving.bitmanipulation;

class Solution07 {
    static int switchSign(int number){
      return ~number + 1;
    }

    public static void main( String args[] ) {
      int number = 8;
      System.out.println(switchSign(number));
    }
}