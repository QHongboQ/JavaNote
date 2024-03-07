package zyBook_Chapter_4;
import java.util.Scanner;

/**
 * Complete this program that prints the position of the last lowercase vowel (a, e, i, o, or u) in a string.
 * Print -1 if the word has no lowercase vowels.
 */
public class zyBook_4_10_4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int position = 1;
        boolean found = false;
        char ch = '?';

        while ((!found) && (position <= word.length()))
        {
            ch = word.charAt(word.length() - position);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                found = true;
            }else
            {
                position++;
            }
        }
        position = word.length() - position;

        System.out.println("Position: " + position);

    }
}
