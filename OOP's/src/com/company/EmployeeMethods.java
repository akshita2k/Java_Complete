package com.company;
import java.util.*;


 class Employee1 {

     int sal;
     String name;

     //method getSalary, getName, setName
     public int getSalary() {
         return sal;
     }

     public String getName() {
         return name;
     }

     public void setName(String name1) {
         name = name1;
     }
}
public class EmployeeMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare the variables;
        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1();

        // Enter details
        e1.setName(sc.nextLine());
        e1.sal = sc.nextInt();

        // Print the details
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
