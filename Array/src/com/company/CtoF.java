package com.company;
import java.util.*;

public class CtoF {
    static void temp (int c) {

            System.out.println((c*(9/5))+32);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int c = sc.nextInt();
        temp(c);
    }
}
