package zyBook_Chapter_2; //属于此文件夹的子脚本

public class zyBook_2_4
{
    static final int SCORE2 = 4; //全局常量，可以在多个method中使用
    public  static  final  int SCORE3 = 9; // 可在多个class中使用，公共常量

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
         * 强制转换类型
         * Definition of cast: Explicitly converting a value from one type to a different type.
         * double balance = total + tax;
         * int dollars = (int) balance;
         * int dollars = (int) (total + tax);
         */
        final int SCORE1 = 10;  // 在单个method中定义一个常量
        double total = SCORE1 +SCORE2 +SCORE3;  //SCORE1为本地常量， SCORE2为全局常量， score3 为公共常量
        double average = total / 3;
        System.out.println(average);
        double Average = (SCORE1 + SCORE2 + SCORE3) / 3.0; //integer 除以 double 得到double
        System.out.println(Average);

        /*
        total += cans;
        total = total + cans;

        total *= 2;
        total = total * 2;
         */

    }
}
