package com.example.hello_world;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();


       Scanner scanner2 = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double Rate = scanner2.nextDouble();
        double Annual_Percent_Rate = Rate / PERCENT;
        double Monthly_Interest = Annual_Percent_Rate/MONTHS_IN_YEAR;


        System.out.print("Period (Years): ");
        Scanner scanner3 = new Scanner(System.in);
        double Period = scanner3.nextDouble();

        double payments = Period * 12;

        double mortgage = principal
                * (Monthly_Interest * Math.pow(1 + Monthly_Interest, payments)
                / (Math.pow(1 + Monthly_Interest, payments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);




    }
}