package zyBook_Chapter_3;

import java.util.Scanner;
public class zyBook_3_1_2
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //定义新的输入
        System.out.print("Original price: ");//打印字符串
        double price = in.nextDouble();      //用户输入值赋予到变量
        double discountedPrice;             //定义变量

        //条件，若价格为10美元以下
        //则减价1美元
        //其余商品减价3.14美刀
        if (price < 10)
        {
            discountedPrice = price - 1;
        }
        else
        {
            discountedPrice = price - 3.14;
        }

        System.out.printf("Discounted price: %.2f\n", discountedPrice);

        }

}