package com.company;


class emp {
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
}
public class AcessMod {
    public static void main(String[] args) {
        emp e1 = new emp();

        // Private access mod
        // e1.id = 19;
        // e1.name = "James";

        e1.setName("James");
        System.out.println(e1.getName());

    }
}
