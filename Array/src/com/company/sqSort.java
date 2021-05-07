package com.company;

public class sqSort {
    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
        int temp =0;
        int [] squares = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            squares[i]= nums[i]*nums[i];
        }
        for(int i=0; i<nums.length;i++) {
            for (int j=i+1; j<nums.length; j++) {
                if(squares[i]>squares[j]) {
                    temp = squares[i];
                    squares[i]=squares[j];
                    squares[j]=temp;
                }
            }
        }
        for (int i=0; i<nums.length; i++) {
            System.out.println(squares[i]);
        }
    }
}
