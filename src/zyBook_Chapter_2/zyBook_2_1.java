package zyBook_Chapter_2;

public class zyBook_2_1
{
    /**
     This program computes the volume (in liters) of a six-pack of soda
     cans and the total volume of a six-pack and a two-liter bottle.
     */
        public static void main(String[] args)
        {
            int cansPerPack = 6;
            final double CAN_VOLUME = 0.355;
            double totalVolume = cansPerPack * CAN_VOLUME;
            char cha = 'A';
            String word = " joke";

            System.out.print("A six-pack of 12-ounce cans contains ");
            System.out.print(totalVolume);
            System.out.println(" liters.");
            System.out.print(cha);
            System.out.printf(word);


        }

}
