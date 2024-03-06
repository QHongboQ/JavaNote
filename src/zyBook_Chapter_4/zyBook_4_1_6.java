package zyBook_Chapter_4;

import java.util.Scanner;
public class zyBook_4_1_6 {
    /**
     *The sum of the reciprocals is infinite.
     * Write a program that reads in a target and finds the first
     */
    public static void main(String[] args)
    {
        double sum = 0;
        int n = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Target: ");
        double target = in.nextDouble();

        /* Your code goes here */
        while(sum <= target)
        {
            n++;
            sum += (double) 1 /n;
        }

        System.out.println("n: " + n);
        System.out.println("sum: " + sum);


    }

}
