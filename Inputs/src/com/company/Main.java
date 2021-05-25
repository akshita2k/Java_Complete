package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);
        // Scans the input entered by the user
        System.out.println("Enter your usn");
        // Enter your usn
        int usn = sc.nextInt();
        // takes the input

        // System.out.println(sc.hasNextInt(usn));
        // checks if the usn entered is an int or not

        //enter first name
        System.out.println("Enter your first name");
        String fname = sc.next();

        //enter the last name
        System.out.println("Enter your last name");
        String lname = sc.next();

        //enter the email
        System.out.println("Enter your email");
        String email = sc.next();

        //prints the details entered
        System.out.println("Your details are:");
        System.out.println("USN : " + usn);
        System.out.println("First Name : " + fname);
        System.out.println("Last Name : " + lname);
        System.out.println("Email : " + email);
    }
}
