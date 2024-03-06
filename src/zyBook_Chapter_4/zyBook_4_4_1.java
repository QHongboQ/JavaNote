package zyBook_Chapter_4;

import java.util.Scanner;
public class zyBook_4_4_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final double RATE = 5;
        double balance = 10000;

        System.out.print("Enter number of years: ");
        int n_years = in.nextInt();

        // Print the table of balances for each year

        for (int year = 1; year <= n_years; year++)
        {
            double interest = balance * RATE / 100;
            balance = balance + interest;
            System.out.printf("%4d %10.2f%n", year, balance);
        }
    }
}
