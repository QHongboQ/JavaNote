package zyBook_Chapter_4;
/**
 * Write a loop that prints all powers of 2 that are less than a given number . For example, if is 100, print
 * ctrl + c: kill a hanging program
 */

import java.util.Scanner;
public class zyBook_4_1_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        /* Your code goes here */
        int number = 1;
        while (number < n)
        {
            System.out.printf("%d ", number);
            number *= 2;
        }
        System.out.println();
    }
}