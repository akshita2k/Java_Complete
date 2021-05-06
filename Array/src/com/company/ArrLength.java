package com.company;

public class ArrLength {
    public static void main(String[] args) {
        int [] marks = { 100,60,40,90,80};
        //length of the array
        System.out.println(marks.length);
        //access each element
        System.out.println(marks[0]);
        //traversal
        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
        //reverse oder traversal
        for (int i=marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }
        //for-each loop
        for (int ele : marks) {
            System.out.println(ele);
        }
    }
}
