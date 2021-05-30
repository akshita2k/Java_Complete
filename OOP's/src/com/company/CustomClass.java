package com.company;
import java.util.*;

 class Employee {
    int id;
    String name;
    int salary;

    // get salary
    public void getSalary() {
        System.out.println(salary);
    }

    //print details
    public void printDetails() {
        System.out.println(id + ", " + name);
    }
}
 public class CustomClass {
    public static void main(String[] args) {

        //initialize
        Employee e = new Employee();
        Employee e1 = new Employee();

        // enter data
        e.id = 12;
        e.name = "James";
        e.salary = 23135;
        e1.id = 13;
        e1.name = "Jhon";
        e1.salary = 13452;

        // print
        e.printDetails();
        e1.printDetails();

        //get
        e1.getSalary();
        e.getSalary();
    }
}
