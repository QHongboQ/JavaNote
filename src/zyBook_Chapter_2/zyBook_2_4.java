package zyBook_Chapter_2; //Below this folder
/**
 * The % operator that computes the remainder of an integer division.
 */
public class zyBook_2_4
{
    static final int SCORE2 = 4; //initialize a constant at the class, can be used by multiple method
    public  static  final  int SCORE3 = 9; // initialize a constant at with public static, can be used by multiple class

    public static void main(String[] args)
    {
        int counter = 1;
        System.out.println(counter);
        counter++; // Adds 1 to the variable counter
        System.out.println(counter);
        counter--; // Subtracts 1 from counter
        System.out.println(counter);

        double x = 10;
        System.out.print("Square root: ");
        System.out.println(Math.sqrt(x));
        System.out.print("Cube: ");
        System.out.println(Math.pow(x, 3));
        System.out.print("Decimal log: ");
        System.out.println(Math.log10(x));
        System.out.print("Rounded: ");
        System.out.println(Math.round(x));
        System.out.print("Absolute value: ");
        System.out.println(Math.abs(x));

        /*
         * Definition of cast: Explicitly converting a value from one type to a different type.
         * double balance = total + tax;
         * int dollars = (int) balance;
         * int dollars = (int) (total + tax);
         */
        final int SCORE1 = 10;  // initialize a constant at the method
        double total = SCORE1 +SCORE2 +SCORE3;
        double average = total / 3;
        System.out.println(average);
        double Average = (SCORE1 + SCORE2 + SCORE3) / 3.0; // Integer divide by double, so the result is double
        System.out.println(Average);

    }
}
