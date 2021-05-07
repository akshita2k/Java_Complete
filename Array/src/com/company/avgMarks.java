package com.company;
import java.util.Scanner;

public class avgMarks {
    public static void main(String[] args) {
        int sum =0;
        float avg =0.000f;
        int [] marks = {100,90,40,50,60,73,75,69};
        for (int i : marks) {
            sum = sum + i;
        }
        avg = sum/(marks.length);
        System.out.print(avg);
    }
}
