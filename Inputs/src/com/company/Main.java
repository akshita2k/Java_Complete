package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your usn");
        int usn = sc.nextInt();
        // System.out.println(sc.hasNextInt(usn));
        System.out.println("Enter your first name");
        String fname = sc.next();
        System.out.println("Enter your last name");
        String lname = sc.next();
        System.out.println("Enter your email");
        String email = sc.next();
        System.out.println("Your details are:");
        System.out.println("USN : " + usn);
        System.out.println("First Name : " + fname);
        System.out.println("Last Name : " + lname);
        System.out.println("Email : " + email);
    }
}
