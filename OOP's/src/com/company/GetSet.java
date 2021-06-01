package com.company;
import java.util.*;

class emp3 {
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
    //method-overloading
    public emp3() {
        id = 31;
        name = "Your name";
    }
    public emp3 (String myname, int n) {
        id= n;
        name = myname;
    }
    public emp3 (String myname) {
        id= 0;
        name = myname;
    }
    public emp3 (int n) {
        id= n;
        name = "Your-name";
    }
}

public class GetSet {
    public static void main(String[] args) {
        emp3 e1 = new emp3("James", 31);
        // e1.setName("James");
        // e1.setId(31);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
