package zyBook_Chapter_4;

import java.util.Scanner;
/**
 This program shows how you can prompt for input that fulfills
 a certain condition. Try entering negative values and then a
 nonnegative value, such as -2 -0.5 9, to see how the negative
 values are rejected.
 */
public class zyBook_4_5_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //先输入数据，然后判断数据为非零的话，就结束循环，不然跳回来再输出数据
        double value;
        do
        {
            System.out.print("Enter a number >= 0: ");
            value = in.nextDouble();
        }
        while (value < 0);
        double root = Math.sqrt(value);
        System.out.println("The square root of the number is " + root);
    }
}
