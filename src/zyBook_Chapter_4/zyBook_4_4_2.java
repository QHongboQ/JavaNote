package zyBook_Chapter_4;

import java.util.Scanner;

/**
 * Write a program that prints a countdown of the form
 * 10...9...8...7...6...5...4...3...2...1...0...Liftoff
 */
public class zyBook_4_4_2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i <= n; i++)
        {
            System.out.printf("%d...", (n - i));
        }
        System.out.print("Liftoff\n");
    }
}
