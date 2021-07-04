package com.company;
import java.util.Scanner;
import java.util.Random;

class Game {
    Random rand = new Random();
    public int Game() {
        int compnum = rand.nextInt();
        return compnum;
    }
    public int getInp(int usernum, int compnum) {
        int res;
        if (usernum == compnum) {
            res = 0;
        }
        else if (usernum > compnum) {
            res =1;
        }
        else {
            res =2;
        }
        return res;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Game g = new Game();
        int guess = g.Game();
        int res = g.getInp(num, guess);
        int score = 100;
        if (res ==0) {
            System.out.println("Your'e right");
            System.out.println("Score = " + score);
        }
        else if (res == 1) {
            System.out.println("The guessed number is less than the actual number");
            score = score - 10;
        }
        else {
            System.out.println("The guessed number is greater than the actual number");
            score = score -10;
        }
    }
}
