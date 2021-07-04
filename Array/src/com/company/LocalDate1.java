package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

public class LocalDate1 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int month = in.nextInt();
            int day = in.nextInt();
            int year = in.nextInt();
            LocalDate dt = LocalDate.of(year, month, day);
            System.out.println(dt.getDayOfWeek());
            System.out.println(dt.getDayOfWeek().getClass().getName());
            in.close();


        }
    }

