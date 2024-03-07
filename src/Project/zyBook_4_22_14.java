package Project;
import java.util.Scanner;
import java.util.Random;
/**
 * Write a program that reads an integer n and a digit d between 0 and 9.
 * Use one or more loops to count how many of the integers between 1 and n
 * start with the digit d.
 * end with the digit d.
 * contain the digit d.
 * In addition to the problem statement, implement the following tasks
 * 1.Create a random number between 1 and 300 for n -
 * We will see how to create random numbers in implementation
 * 2.It would be best to validate your digit 0 <= d <= 9.
 * We will pseudocode in implementation.
 * Use a loop to ask the user for the correct number.
 */

public class zyBook_4_22_14 {
    public static void main(String[] args)
    {
        // initialize the variables
        Scanner in = new Scanner(System.in);
        int n = (int) (Math.random() * 300) + 1;

        // ask the user to enter the digital d
        System.out.print("Please enter a digital number 'd' (0 <= d <= 9): ");
        int d = in.nextInt();

        // check whether d is less than 0 or bigger than 9
        while((d < 0) || (d > 9))
        {
            System.out.print("Error digital number, please enter again: ");
            d = in.nextInt();
        }

        // show to the user what they entered
        System.out.println("The random number n is " + n + ".");
        System.out.println("Your entered digital d is " + d);

        //initialize variables
        boolean isFirstDigit = false;
        boolean isLastDigit = false;
        boolean doesContain = false;
        int isFirstCount = 0;
        int isLastCount = 0;
        int doesContainCount = 0;

        //convert n to string type
        //convert d to char type
        String nn = "";
        String dd = "" + d;
        char ddd = dd.charAt(0);

        // One pool for the number from 1 to n
        for (int i = 1; i <= n; i++)
        {
            nn = nn + i;

            // check whether the number starts with digital d
            if(nn.charAt(0) == ddd)
            {
                isFirstDigit = true;
            }
            // check whether the number ends with digital d
            if(nn.charAt(nn.length() - 1) == ddd)
            {
                isLastDigit = true;
            }
            // check whether the number contains digital d
            if(nn.contains("" + ddd))
            {
                doesContain = true;
            }

            // If something is true, the count plus one
            if(isFirstDigit)
            {
                isFirstCount++;
            }
            if(isLastDigit)
            {
                isLastCount++;
            }
            if(doesContain)
            {
                doesContainCount++;
            }

            // let the variable go back to the initial state
            isFirstDigit = false;
            isLastDigit = false;
            doesContain = false;
            nn = "";
        }

        // print the result to the user
        System.out.println("The count of number starts with the digital " + d + " is " + isFirstCount + ".");
        System.out.println("The count of number ends with the digital " + d + " is " + isLastCount+ ".");
        System.out.println("The count of number contains  the digital " + d + " is " + doesContainCount+ ".");
    }
}
