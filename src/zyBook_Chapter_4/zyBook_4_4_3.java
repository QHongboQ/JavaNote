package zyBook_Chapter_4;
import java.util.Scanner;

/**
 * 要求编写一个程序，
 * 该程序读取三个整数 A、B 和 N，
 * 并打印出在 A 和 B（包括 A 和 B）之间可以被 N 整除的数字的数量。
 * 要求使用循环来实现。
 */
public class zyBook_4_4_3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int count = 0;

        for(int i = 0; i <= (b - a); i ++)
        {
            if((a + i) % n == 0)
                count++;
        }
        /* Your code goes here */

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("n: " + n);
        System.out.println("count: " + count);
    }
}
