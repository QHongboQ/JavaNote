package zyBook_Chapter_3;
import java.util.Scanner;

/**
 * Write a program that compares a list price and an actual price.
 * Your program should print a single message.
 * If the actual price is less than 50% of the list price, print "Great deal".
 * Otherwise, if the actual price is less than 80% of the list price, print "Good deal".
 *  If that is not the case but the actual price is no more than the list price, print "Ok deal".
 *  If none of these apply, print "Bad deal".
 */
public class zyBook_3_8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Define a new Scanner, name is in
        System.out.print("List price: "); // Promote user input
        double listPrice = in.nextDouble(); // Load the input of user
        System.out.print("Actual price: "); // Promote user input
        double actualPrice = in.nextDouble(); // Load the input of user

        if(actualPrice < (0.5 * listPrice) )
        {
            System.out.print("Great deal\n");
        } else if (actualPrice < (0.8 * listPrice) )
        {
            System.out.print("Good deal\n");
        } else if (actualPrice <= listPrice)
        {
            System.out.print("Ok deal\n");
        }else
        {
            System.out.print("Bad deal\n");
        }

    }

}
