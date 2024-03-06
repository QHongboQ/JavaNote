package zyBook_Chapter_3;

import java.util.Scanner;
/**Problem Statement: The university bookstore has a Kilobyte Day sale every October 24
 * giving an 8 percent discount on all computer accessory purchases if the price is less than $128,
 * and a 16 percent discount if the price is at least $128.
 * Write a program that asks the cashier for the original price and then prints the discounted price.
 * Step 1 Decide upon the branching condition.
 * original price < 128?
 * Step 2 Give pseudocode for the work that needs to be done when the condition is true.
 * discounted price = 0.92 x original price
 * Step 3 Give pseudocode for the work (if any) that needs to be done when the condition is not true.
 * discounted price = 0.84 x original price
 * Step 4 Double-check relational operators.
 * Step 5 Remove duplication.
 * Step 6 Test both branches.
 * Step 7 Assemble the statement in Java.
 */
public class zyBook_3_5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Original price before discount: ");
        double originalPrice = in.nextDouble();

        double discountRate;
        if (originalPrice < 128)
        {
            discountRate = 0.92;
        }
        else
        {
            discountRate = 0.84;
        }
        double discountedPrice = discountRate * originalPrice;

        System.out.printf("Discounted price: %.2f%n", discountedPrice);
    }
}
