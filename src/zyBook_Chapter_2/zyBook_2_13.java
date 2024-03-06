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

         //计算字符串长度
         int n = firstName.length();
         int m = lastName.length();
         System.out.printf("Firstname length is :%d, LastName length is: %d%n", n, m);

         //单个字符 char type
         char start = firstName.charAt(0); // 读取firstName中index为0的字符
         char last = lastName.charAt(lastName.length()-1); //读取lastName中 index为总长度-1 的字符，即最后一个字符
         System.out.printf("The first char is: %s, the last char is:%s\n", start, last);

         //字符串获取    str.substring(start, end + 1)
         //获取 整个名字的字符串中的，从index1开始，到index最后一个的前一个的字符
         //即为去头去尾
         String CancelFirstLast = (firstName + " " + lastName).substring(1, (firstName + " " + lastName).length()-1);
         System.out.printf("If your name cancel the first letter and last letter, is should be: %s%n", CancelFirstLast);
     }

}
