package zyBook_Chapter_3;

import java.util.Scanner;
public class zyBook_3_1_1 {

    /*
     This program simulates an elevator panel that skips the 13th floor.
     if 的示例
     */

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);    //定义Scanner
            System.out.print("Floor: ");            //打印Floor
            int floor = in.nextInt();               //加载用户输入值

            // Adjust floor if necessary

            int actualFloor;                //定义变量
            if (floor > 13)                 //if语句，若输入的floor值大于13，则执行接下来的语句
            {
                actualFloor = floor - 1;    //若满足条件则执行
            }
            else
            {
                actualFloor = floor;        //若不满足条件则执行
            }

            System.out.println("The elevator will travel to the actual floor "
                    + actualFloor);         //输出执行后的结果
        }
    }


