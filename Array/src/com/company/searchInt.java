package com.company;
import java.util.Scanner;

public class searchInt {
    public static void main(String[] args) {
        int bool =0;
        Scanner sc = new Scanner (System.in);
        int search =0;
        int []num = new int[100];
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0; i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search:");
        search = sc.nextInt();
        for (int i=0; i<size; i++) {
            if(num[i] == search) {
                 bool++;
            }
        }
        if (bool ==1 ) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }
}
