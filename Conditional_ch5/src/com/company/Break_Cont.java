package com.company;
import java.util.Scanner;

public class Break_Cont {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        for (int i=0; i<10; i++) {
            if ( i ==2) {
                continue;
            }
            if ( i ==4 ) {
                break;
            }
            System.out.println(i);
        }
    }
}
