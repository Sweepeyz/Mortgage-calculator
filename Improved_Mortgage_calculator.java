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

        double principal;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextDouble();
            if (principal > 1000000 || principal < 1000)
                System.out.println("Must be between $1K and $1M");
            else
                break;
        }

        double Monthly_Interest;
        while (true) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Annual Interest Rate: ");
            float Rate = scanner2.nextFloat();
            float Annual_Percent_Rate = Rate / PERCENT;
            Monthly_Interest = Annual_Percent_Rate / MONTHS_IN_YEAR;
            if (Rate <= 0 || Rate >= 30)
                System.out.println("Rate must be greater than 0 and less than or equal to 30");
            else
                break;
        }

        int Period;
        while (true) {
            System.out.print("Period (Years): ");
            Scanner scanner3 = new Scanner(System.in);
            Period = scanner3.nextInt();
            if (Period < 1 || Period > 30)
                System.out.println("Enter a value between 1 and 30");
            else
                break;
        }
        float payments = Period * 12;

        double mortgage = principal
                * (Monthly_Interest * Math.pow(1 + Monthly_Interest, payments)
                / (Math.pow(1 + Monthly_Interest, payments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }
}