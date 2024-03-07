package zyBook_Chapter_4;

import java.util.Scanner;
/**
 * 找到第一个元音
 */
public class zyBook_4_10_3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        boolean found = false;
        String ch = "";
        int position = 0;

        while ((!found) && (position < word.length()))
        {
            ch = word.substring(position, position + 1);
            if ("aeiou".contains(ch.toLowerCase()))
            {
                found = true;
            }
            else
            {
                position++;
            }
        }
        if (found)
        {
            System.out.println("First vowel: " + ch);
            System.out.println("Position: " + position);
        }
        else
        {
            System.out.println("No vowels");
        }

    }
}
