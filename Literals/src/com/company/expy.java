package com.company;
import java.util.Scanner;

public class expy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        //for (int i = 0; i < t; i++) {
            int size = sc.nextInt();
            int num = sc.nextInt();
            int temp = num;
            int[] a = new int[size];
            for (int j = 0; j < size; j++) {
                while (num > 0) {
                    temp = temp % 10;
                    a[j] = temp;
                    num = num/10;
                }
            }
            for (int k=0; k<a.length; k++) {
                System.out.println(a[k]);
            }
        }
    }
//}

