package com.company;
import java.util.Scanner;

public class evenLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []nums = new int[10];
        int count=0;
        for (int i=0; i<nums.length; i++) {
            String str = Integer.toString(nums[i]);
            if (str.length() % 2==0) {
                count++;
            }
        }
    }
}
