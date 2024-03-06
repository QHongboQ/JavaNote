package zyBook_Chapter_2;

import java.util.Scanner;

 class zyBook_2_8
{
    /*
    Definition of prompt: A string that tells the user to provide input.
    import java.util.Scanner; 头文件
    Scanner in = new Scanner(System.in); 初始化键盘输入变量
    System.out.print("Please enter the number of bottles: "); // Display prompt
    int bottles = in.nextInt(); 获取输入
    double price = in.nextDouble();
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
        /*
        打印规则
        %d  int
        %f  double
        %s  "string" or String
        %n  new line
        %5.2f   共五个字符，保留两位小数的 double
         */
        System.out.printf("Price per ounce: %8.2f%n", packVolume); //总共八个字节，保留两位小数

    }
}
