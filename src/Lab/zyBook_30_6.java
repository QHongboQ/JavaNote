package Lab;
import java.util.Scanner;

public class zyBook_30_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean quit = false;
        String reverse = "";

        while(!quit)
        {
            String word = in.nextLine();
            if(word.equals("Done") || word.equals("done") || word.equals("d"))
            {
                quit = true;
            }else
            {
                for (int i = 0; i < word.length(); i++)
                {
                    char c = word.charAt(i);
                    reverse = c + reverse;
                }
                System.out.print(reverse + "\n");
            }
            reverse = "";
        }
    }


}
