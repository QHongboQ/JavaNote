package zyBook_Chapter_3;
import java.util.Scanner;

/**
 * check the user input the integer
 * if (in.hasNextInt())
 * {
 *    int floor = in.nextInt();
 *    Process the input value.
 * }
 * else
 * {
 *    System.out.println("Error: Not an integer.");
 * }
 */
public class zyBook_3_15_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;

        if (fizz)
        {
            System.out.print("fizz");
        }
        if (buzz)
        {
            System.out.print("buzz");
        }
        if (!fizz && !buzz)
        {
            System.out.print(n);
        }
        System.out.println();
    }
}
