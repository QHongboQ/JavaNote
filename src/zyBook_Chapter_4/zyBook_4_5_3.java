package zyBook_Chapter_4;

import java.util.Scanner;

/**
 * Write a do loop that reads integers and computes their sum.
 * Stop when a zero is read or the when the same value is read twice in a row.
 * For example, if the input is 1 2 3 4 4, then the sum is 14 and the loop stops.
 */
public class zyBook_4_5_3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int previous;
        int sum = 0;
        int x = 0;

        do
        {
            previous = in.nextInt();
            sum += previous;

            if(previous == x)
                break;
            else
                x = previous;
        }
        while (previous != 0 );

        System.out.println("Sum: " + sum);
    }
}
