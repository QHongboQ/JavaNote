package zyBook_Chapter_4;
import java.util.Scanner;
public class zyBook_4_3_4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // TODO: Print the digits of n in reverse
        int i = 0;
        String result = "";
        String nn = result + n;

        /* Your code goes here */
        if (n == 0)
        {
            i++;
            result = "0";
        }
        while (i < nn.length())
        {
            char c = nn.charAt(nn.length() - (i + 1));
            result = result + c;
            i++;
        }
        System.out.print(result);

        System.out.println();
    }
}
