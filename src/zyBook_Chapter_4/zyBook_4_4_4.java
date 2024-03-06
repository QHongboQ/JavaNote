package zyBook_Chapter_4;
import java.util.Scanner;

/**
 * Complete this program and count how many letters 'e' are in the given string.
 * Use a loop.
 */
public class zyBook_4_4_4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        int count = 0;

        for(int i = 0; i < word.length() - 1; i++)
        {
            if(word.charAt(i) == 'e')
                count++;
        }

        System.out.println("word: " + word);
        System.out.println("count of e: " + count);
    }
}
