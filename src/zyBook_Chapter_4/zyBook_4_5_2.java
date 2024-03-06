package zyBook_Chapter_4;

import java.util.Scanner;

/**
 * Complete this program, prompting the user to enter two positive numbers a and b so that a is less than b.
 */
public class zyBook_4_5_2 {

    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);

    int a;
    int b;
    // HINT: Choose an appropriate loop and a loop condition
    /* Your code goes here */
    do
    {
        System.out.println(
                "Enter two positive integers, the first smaller than the second.");
        a = in.nextInt();
        System.out.println("First: " + a);
        b = in.nextInt();
        System.out.println("Second: " + b);
     }while(a >= b || a <= 0);

     // This line should only be printed when the input is correct
     System.out.println("You entered " + a + " and " + b);
    }

}
