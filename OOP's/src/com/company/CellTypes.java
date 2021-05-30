package com.company;
import java.util.Scanner;

class Cellphone {

    public void Ring() {
        System.out.println("ringing...");
    }

    public void Vib() {
        System.out.println("Vibrating...");
    }
}
public class CellTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cellphone c1 = new Cellphone();
        System.out.println("Enter the state of Cellphone");
        System.out.println("0 for on Ringer, 1 for Vibration");
        int state = sc.nextInt();
        if (state==0) {
            c1.Ring();
        }
        else {
            c1.Vib();
        }
    }
}
