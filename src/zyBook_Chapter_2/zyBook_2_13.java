package zyBook_Chapter_2;

import java.util.Scanner;

public class zyBook_2_13 {
    /*
    Text consists of characters: letters, numbers, punctuation, spaces, and so on.
     A string is a sequence of characters.
     */
     public static  void main(String[] args)
     {
         Scanner in = new Scanner(System.in);
         System.out.print("Please enter your first and last name: ");

         // Read in the first and last name
         // Only can input one word
         String firstName = in.next();
         String lastName = in.next();

         // Print the last name, a comma, a space, and the first name
         // \" can print ", \\ can print \, \n means newline
         System.out.println("Your are\"" + lastName + ", " + firstName + "\"" + "\nNice to meet you!");

         //When the expression to the left of a operator is a string,
         // the other one is automatically forced to become a string as well, and both strings are concatenated.
         /*
          *  int test = 5;
          *  String s = "";
          *  String s = s + 5;
          *  System.out.print(s);
          *  the output will be 5
          *  but is String type
          */

         //evaluate the length of string, index is from 0 to String.length()-1;
         int n = firstName.length();
         int m = lastName.length();
         System.out.printf("Firstname length is :%d, LastName length is: %d%n", n, m);

         // char type, only one character
         char start = firstName.charAt(0); // get the character of firstName whose index is 0
         char last = lastName.charAt(lastName.length()-1);
         //get the character of firstName whose index is length()-1, which is the last character
         System.out.printf("The first char is: %s, the last char is:%s\n", start, last);

         //extract substrings    str.substring(start, end + 1)
         //returns a string that is made up of the characters in the string str,
         //starting at position start, and containing all characters up to, but not including, the position pastEnd.
         String CancelFirstLast = (firstName + " " + lastName).substring(1, (firstName + " " + lastName).length()-1);
         System.out.printf("If your name cancel the first letter and last letter, is should be: %s%n", CancelFirstLast);
     }

}
