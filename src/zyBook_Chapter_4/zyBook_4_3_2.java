package zyBook_Chapter_4;
/**
 * substring(Start, end + 1)
 * substring(Start) //from start until end
 * String1.contains(String2) // check the String 1 whether contains the String2
 */

import java.util.Scanner;
public class zyBook_4_3_2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String rest = s;
        String result = "";
        int i = 0;
        while (rest.length() > 0)
        {
            String first = rest.substring(0, 1);
            rest = rest.substring(1);
            if ((rest.contains(first)) && !(result.contains(first)))
            {
                result = result + first;
            }
        }
        System.out.println(result);

    }
}
