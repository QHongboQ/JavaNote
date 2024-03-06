package zyBook_Chapter_4;
/**
 This program prints ten random numbers between 0 and 1.
 Math.random() 生成从0到1的随机double
 */
public class zyBook_4_16_1 {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            int r = (int) (Math.random() * 100); //乘范围 加减位移
            System.out.println(r);
        }
    }
}
