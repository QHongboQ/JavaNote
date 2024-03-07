package zyBook_Chapter_4;

import java.util.Scanner;
/**
 * Write a program that prints all digits of a positive integer in reverse order.
 * When we want to let an integer type convert to a string type.
 * We can initialize an empty string and add it to the integer number.
 */

public class zyBook_4_3_3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // TODO: Print the digits of n in reverse
        int i = 0;
        String result = "";
        String nn = result + n;

        while ( i < nn.length())
        {
            char digit = nn.charAt(nn.length()- (i + 1));
            result = result + digit;
            /* Your code goes here */
            System.out.print(digit);
            /* Your code goes here */
            i++;
        }

        System.out.println(result);

    }
}
