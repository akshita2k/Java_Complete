package com.company;


class TommyVecetti {
    public void hit() {
        System.out.println("Hitting");
    }
    public void run() {
        System.out.println("Running");
    }
    public void fire() {
        System.out.println("Firing");
    }
}
public class Tommy {
    public static void main(String[] args) {
        TommyVecetti player1 = new TommyVecetti();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
