package zyBook_Chapter_3;

import java.util.Scanner;
public class zyBook_3_1_1 {

    /*
     This program simulates an elevator panel that skips the 13th floor.
     */

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);    //initialize the Scanner machine
            System.out.print("Floor: ");            //print floor
            int floor = in.nextInt();               //assignment the value to the variable

            // Adjust floor if necessary

            int actualFloor;                //initialize
            if (floor > 13)                 //if() loop, if the condition is true, enter the loop
            {
                actualFloor = floor - 1;    //if condition is true, run this statement
            }
            else
            {
                actualFloor = floor;        //if the condition is false, run this statement
            }

            System.out.println("The elevator will travel to the actual floor "
                    + actualFloor);
        }
    }


