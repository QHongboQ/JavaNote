package zyBook_Chapter_2;

public class zyBook_2_1
{
    /**
     * Definition of variable: A symbol in a program that identifies a storage location that can hold different values.
     * Definition of initialization: Setting a variable to a well-defined value when it is created.
     * Definition of floating-point number: A number that can have a fractional part
     * It is a convention among Java programmers that variable names should start with a lowercase letter
     * (such as canVolume) and class names should start with an uppercase letter (such as HelloPrinter).
     * That way, it is easy to tell them apart.
     This program computes the volume (in liters) of a six-pack of soda
     cans and the total volume of a six-pack and a two-liter bottle.
     */
        public static void main(String[] args)
        {
            int cansPerPack = 6;                // Initialization of a integer type
            final double CAN_VOLUME = 0.355;    // Initialization of a constant
            double totalVolume = cansPerPack * CAN_VOLUME;  // Initialization of a double type
            char cha = 'A';         // Initialization of a char type
            String word = " joke";

            System.out.print("A six-pack of 12-ounce cans contains ");
            System.out.print(totalVolume);
            System.out.println(" liters.");
            System.out.print(cha);
            System.out.printf(word);


        }

}
