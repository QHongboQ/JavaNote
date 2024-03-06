package zyBook_Chapter_4;
import java.util.Scanner;

/**
 * 检测输入的数字中是否有重复数字
 */
public class zyBook_4_10_6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double input = 0;
        while (in.hasNextDouble())
        {
            double previous = input;
            input = in.nextDouble();
            if (input == previous)
            {
                System.out.println("Duplicate input");
            }
        }

    }
}
