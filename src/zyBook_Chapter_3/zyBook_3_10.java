package zyBook_Chapter_3;
import java.util.Scanner;

/**
 * Definition of enumeration type: A type with a finite number of values
 * each of which has its own symbolic name
 * For example
 * public enum FilingStatus { SINGLE, MARRIED, MARRIED_FILING_SEPARATELY }
 * FilingStatus status = FilingStatus.SINGLE;
 * put above of main method
 */

public class zyBook_3_10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        String suffix = in.next();
        String time = "evening";
        if (suffix.equals("pm"))
            if (hour < 6)
                time = "afternoon";
            else
                time = "morning";
        System.out.println("Good " + time);
    }

}
