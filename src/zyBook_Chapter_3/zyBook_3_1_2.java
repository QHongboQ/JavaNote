package zyBook_Chapter_3;

import java.util.Scanner;
public class zyBook_3_1_2
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // initialize a new Scanner machine
        System.out.print("Original price: ");// print the string
        double price = in.nextDouble();      // User gives a value and assignment to the double type
        double discountedPrice;

        //条件，若价格为10美元以下
        //则减价1美元
        //其余商品减价3.14美刀
        //condition, if the price is less than 10
        // have a discount of 1 dollar
        // others product has discount of 3.13 dollars
        if (price < 10)
        {
            discountedPrice = price - 1;
        }
        else
        {
            discountedPrice = price - 3.14;
        }

        System.out.printf("Discounted price: %.2f\n", discountedPrice);

        }

}