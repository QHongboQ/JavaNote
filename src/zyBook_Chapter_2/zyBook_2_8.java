package zyBook_Chapter_2;

import java.util.Scanner;

 class zyBook_2_8
{
    /*
    Definition of prompt: A string that tells the user to provide input.
    import java.util.Scanner; header from other class
    Scanner in = new Scanner(System.in); initialize input machine
    System.out.print("Please enter the number of bottles: "); // Display prompt
    int bottles = in.nextInt(); get input
    double price = in.nextDouble();
    String s = in.next();   // Get a word
    char c = s.charAt(0);   // Get the char type character of the input word
    String line = in.nextline();    Get a whole line
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Read can volume
        System.out.print("Please enter the volume for each can (in ounces): ");
        double canVolume = input.nextDouble();

        // Compute pack volume
        final double CANS_PER_PACK = 6;
        double packVolume = canVolume * CANS_PER_PACK;

        // Compute and print price per ounce
        /* Formatted Output
        Using printf();
        %d  int
        %f  double
        %s  "string" or String
        %n  new line
        %5.2f   Spaces are added so that the field width is 5，Prints two digits after the decimal point.
         */

        //Spaces are added so that the field width is 8，Prints two digits after the decimal point.
        System.out.printf("Price per ounce: %8.2f%n", packVolume);

    }
}
