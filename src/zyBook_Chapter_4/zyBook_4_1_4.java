package zyBook_Chapter_4;
/**
 * Let's modify the program from this section so that the user can supply the interest rate.
 * For very small interest rates, it may take a very long time for the balance to double.
 * Assume the user can't wait for more than twenty years.
 * Stop adding interest when the balance has doubled or twenty years have elapsed.
 */

import java.util.Scanner;
public class zyBook_4_1_4 {
    public static void main(String[] args)
    {
        final double INITIAL_BALANCE = 10000;
        final double TARGET = 2 * INITIAL_BALANCE;

        double balance = INITIAL_BALANCE;
        int year = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Interest rate in percent: ");
        double rate = in.nextDouble();

        // TODO: Count the years required for the investment to double
        // but no more than 20 years

        /* Your code goes here */
        while ((balance < TARGET) && (year < 20))
        {
            year++;
            double interest = balance * rate / 100 ;
            balance += interest ;
        }
        /* Your code goes here */

        System.out.println("Year: " + year);
        System.out.printf("Balance: %.2f%n", balance);


    }
}
