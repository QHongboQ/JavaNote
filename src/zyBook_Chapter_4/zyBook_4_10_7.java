package zyBook_Chapter_4;
import java.util.Scanner;

/**
 * Write a program that reads a sentence, a word at a time,
 * and removes any adjacent duplicates.
 * The sentence ends when you read a word that ends in a period.
 * The sentence will have at least two words.
 * 此中有使用例子 String.endsWith("String"), 含义是 是否出现指定的后缀, 返还值为真和假
 */
public class zyBook_4_10_7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        boolean done = false;
        while (!done)
        {
            String previous = word;
            word = in.next();

            if (word.endsWith("."))
            {
                done = true;
                word = word.substring(0,word.length()-1);
            }
            if (!previous.equals(word))
            {
                System.out.print(previous + " ");
            }
        }
        System.out.print(word + ".");
    }
}
