package zyBook_Chapter_4;

import java.util.Scanner;
/**
 * Definition of sentinel: A value in input that is not to be used as an actual input value but to signal the end of input
 */
public class zyBook_4_6_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double salary = 0;
        System.out.print("Enter salaries, -1 to finish: ");

        // Process data until the sentinel is entered
        while (salary != -1)
        {
            salary = in.nextDouble();
            if (salary != -1)
            {
                sum = sum + salary;
                count++;
            }
        }

        // Compute and print the average
        if (count > 0)
        {
            double average = sum / count;
            System.out.println("Average salary: " + average);
        }
        else
            System.out.println("No data");
    }
}
