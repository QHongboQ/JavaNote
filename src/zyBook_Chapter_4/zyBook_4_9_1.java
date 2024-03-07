package zyBook_Chapter_4;

import java.util.Scanner;

/**
 * Complete the following program to implement the user interface of the preceding exercise.
 * For simplicity, only the units cm, m, and in are supported.
 * Hint: The value of factor1 or factor2 should be the conversion factor from the selected unit to cm.
 * Ex: If the selected unit is in, factor1 is 2.54 because 1 in = 2.54 cm.
 */
public class zyBook_4_9_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double factor1 = 0;
        double factor2 = 0;
        String unit1 = "";
        String unit2 = "";

        while (!done) {
            boolean getSecond = true;

            String command = in.next();
            System.out.println("From unit (in, cm, m, again, quit): " + command);
            if (command.equals("in")) {
                factor1 = 2.54; // Convert to cm
                unit1 = command;
            } else if (command.equals("cm")) {
                factor1 = 1; // Convert to cm
                unit1 = command;
            } else if (command.equals("m")) {
                factor1 = 100; // Convert to m
                unit1 = command;
            } else if (command.equals("again")) {
                getSecond = false;
            } else if (command.equals("quit")) {
                done = true;
                getSecond = false;
            } else {
                System.out.println("Sorry, unknown unit.\n");
                getSecond = false;
            }

            if (getSecond) // If 'from' unit is valid, get 'to' unit
            {
                unit2 = in.next();
                System.out.println("To unit: " + unit2);
                if (unit2.equals("in")) {
                    factor2 = 2.54; // Convert from cm
                } else if (unit2.equals("cm")) {
                    factor2 = 1; // Convert from cm
                }else if (unit2.equals("m")) {
                    factor2 = 100; // Convert from cm
                }else {
                    System.out.println("Sorry, unknown unit.\n");
                    getSecond = false;
                }
            }

            if (getSecond || (command.equals("again")))
            {
                double value = in.nextDouble();
                double result = value * factor1 / factor2;
                System.out.println(value + " " + unit1 + " = " + result + " " + unit2 + "\n");
            }
        }
    }
}
