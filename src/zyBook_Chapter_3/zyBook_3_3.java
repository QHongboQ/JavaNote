package zyBook_Chapter_3;

import java.util.Scanner;
public class zyBook_3_3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //定义新的输入

        //快速比较
        int floor = in.nextInt();
        //Definition of conditional operator: The operator that yields one of two values, depending on a condition
        //输出 Actual floor floor大于13吗，真的话输出floor -1，否则输出floor
        System.out.println("Actual floor: " + (floor > 13 ? floor -1 : floor) );

        //比较字符串
        String string1 = in.next();
        String string2 = in.next();
        if(string1.equals(string2))
        {
            // string1 == string2 报错，字符串不可恒等比较
            System.out.println("Two strings are equal");
        }
        else
        {
            System.out.println("Two string are not equal");
        }

    }

}
