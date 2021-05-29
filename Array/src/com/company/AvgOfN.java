package com.company;
// import java.util.*;

public class AvgOfN {
    static float average( int ...arr) {
       int size = arr.length;
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
       float avg = sum /9;
        return avg;
    }
    public static void main(String[] args) {
       // Scanner sc = new Scanner (System.in);
       // int n = sc.nextInt();
        System.out.println(average(1,2,3,4,5,6,7,8,9));
    }
}
