package zyBook_Chapter_3;

import java.util.Scanner;
public class zyBook_3_3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //initialize a new Scanner machine

        //Conditional Operator
        int floor = in.nextInt();
        //Definition of conditional operator: The operator that yields one of two values, depending on a condition
        //input Actual floor is bigger than 13 ? if yes, output floor -1, else output floor
        System.out.println("Actual floor: " + (floor > 13 ? floor -1 : floor) );

        // comparison with String, using String.equals()
        String string1 = in.next();
        String string2 = in.next();
        if(string1.equals(string2))
        {
            // string1 == string2 Error，String cannot comparer with ==
            System.out.println("Two strings are equal");
        }
        else
        {
            System.out.println("Two string are not equal");
        }

    }

}
