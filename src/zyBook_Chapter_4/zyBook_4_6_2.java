package zyBook_Chapter_4;

import java.util.Scanner;

/**
 * Complete this program that reads integers and computes their sum.
 * Use 0 as a sentinel value.
 */
public class zyBook_4_6_2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int input;
        System.out.print("Enter values, 0 to quit: ");

        do{
            input = in.nextInt();
            sum += input;
        }while (input != 0);

        /* Your code goes here */

        System.out.println("Sum: " + sum);
    }
}
