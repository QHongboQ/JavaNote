package zyBook_Chapter_4;

import java.util.Scanner;

/**
 * Print the string inverse order
 */

public class zyBook_4_3_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = in.next();

      /* Implement this pseudocode:
         r = ""
         i = 0
         while i < length of s
            c = ith character of s
            r = c + r
            i++
      */
        String r = "";
        int i = 0;
        while (i < s.length())
        {
            char c = s.charAt(i);
            r = c + r;
            i++;
        }

        System.out.println(r);
    }
}
