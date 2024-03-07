package zyBook_Chapter_4;
import java.util.Scanner;

/**
 * 一个检查输入是否合法的示例
 * 先输入，然后确定是否在合法情况之内，如果不在进入循环，重新输入
 * int birthYear = in.nextInt();
 * while ((birthYear <= 1900) || (birthYear >= 2024))
 * {
 *    System.out.print("Invalid value for year. Enter another value: ");
 *    birthYear = in.nextInt();
 * }
 * 以下的示例是确定最大值和最小值
 */
public class zyBook_4_10_5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean exit = false;

        //比较最大数字
        double largest = in.nextDouble();   //输入新变量
        while (in.hasNextDouble() && !exit)      //若新变量为一个Double型，则进入循环
        {
            double input = in.nextDouble(); //再次输入一个数字
            if (input > largest)    //若新输入的数字比上个数字大，则替换掉上个数字
            {
                largest = input;
            }
            if (input == 0)
                exit = true;
        }

        //同理，比较最小数字
        exit = false;
        double smallest = in.nextDouble();
        while (in.hasNextDouble() && !exit)
        {
            double input = in.nextDouble();
            if (input < smallest)
            {
                smallest = input;
            }
            if(input == 0)
                exit = true;
        }

        System.out.println("The largest number is: " + largest + ". The smallest number is: " + smallest + ".");

    }
}
