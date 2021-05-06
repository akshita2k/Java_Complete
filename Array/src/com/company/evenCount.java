package com.company;
import java.util.Scanner;

public class evenCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int []nums = new int[10];
        int maximum = 0;
        int count = 0;
        for( int i = 0; i<nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            }
            else {
                count++;
                maximum = Math.max(maximum, count);
            }
        }
    }
}
