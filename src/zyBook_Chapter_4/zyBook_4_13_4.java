package zyBook_Chapter_4;
import java.util.Scanner;

/**
 * Write a program that prints all letters that occur a single time in a string.
 * For example, if the string is Mississippi, print M, and if it is Missouri, print Mour.
 * Use nested loops to solve this problem.
 *
 * 生成随机数
 * Math.random()
 */
public class zyBook_4_13_4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        String result = "";



        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++)
            {
                if(word.charAt(j) == c)
                {
                    count++;
                }
            }
            /* Your code goes here */
            if (count == 1)
                result += c;

        }
        System.out.println(result);
    }
}
