package zyBook_Chapter_4;
/*
 * Suppose we add $100 to a checking account in year 1, $200 in year 2, $300 in year 3, and so on.
 * The account earns no interest.
 * After how many years will the balance reach a given target?
 * Modify the program below to produce the answer.
 */

import java.util.Scanner;
public class zyBook_4_1_5 {
    public static void main(String[] args)
    {
        double balance = 0;
        int year = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Target: ");
        double target = in.nextDouble();

        // TODO: Add $100 in year 1, $200 in year 2, ..., until the
        // target has been reached

        /* Your code goes here */
        while(balance < target)
        {
            year++;
            int addDollar = year * 100;
            balance += addDollar;
        }

        System.out.println("Year: " + year);
        System.out.printf("Balance: %.2f%n", balance);
    }
}
