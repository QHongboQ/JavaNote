package zyBook_Chapter_4;
import java.util.Scanner;

public class zyBook_4_1_3 {
    public static void  main(String[] args)
    {
        final double RATE = 5;
        final double INITIAL_BALANCE = 10000;
        final double TARGET = 2 * INITIAL_BALANCE;

        Scanner in = new Scanner(System.in);
        System.out.print("Annual contribution: ");
        double contribution = in.nextDouble();

        double balance = INITIAL_BALANCE;
        int year = 0;

        // TODO: Add annual contribution, but not in year 0
        while (balance < TARGET)
        {
            year++;
            double interest = balance * RATE / 100;
            balance = interest + balance + contribution;
        }
        /* Your code goes here */
        balance -= contribution;
        System.out.println("Year: " + year);
        System.out.printf("Balance: %.2f%n", balance);
    }
}
