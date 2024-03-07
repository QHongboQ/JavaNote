package zyBook_Chapter_3;
import java.util.Scanner;

/**Problem Statement: Your task is to extract a string containing the middle character from a given string .
 * For example, if the string is , the result is the string .
 * However, if the string has an even number of letters, extract the middle two characters. If the string is
 * the result is .str“crate”“a”“crates”“at”
 * Step 1 Decide on the branching condition.
 * Is the length of the string odd?
 * if (str.length() % 2 == 1)
 * Step 2 Give pseudocode for the work that needs to be done when the condition is true.
 * position = str.length() / 2 (with the remainder discarded)
 * result = str.substring(position, position + 1)
 * Step 3 Give pseudocode for the work (if any) that needs to be done when the condition is not true.
 * result = str.substring(2, 4);
 * position = str.length() / 2 - 1
 * result = str.substring(position, position + 2)
 * Step 4 Double-check relational operators.
 * Step 5 Remove duplication.
 * Step 6 Test both branches.
 * Step 7 Assemble the statement in Java.
 */
public class zyBook_3_6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.next();

        int position;
        int length;
        if (str.length() % 2 == 1)
        {
            position = str.length() / 2;
            length = 1;
        }
        else
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        String result = str.substring(position, position + length);

        System.out.println("Middle: " + result);
    }

}
