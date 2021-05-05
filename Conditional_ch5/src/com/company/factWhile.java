package com.company;
import java.util.Scanner;


public class factWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i =1;
        int fact = 1;
        while (n!=0) {
            fact = fact *i;
            i++;
            n--;
        }
        System.out.println(fact);
    }
}