package zyBook_Chapter_4;

/**
 *
 */
public class zyBook_4_10_2 {
    public static void main(String[] args)
    {
        String str = "Max had a little lamb";   //引入字符串
        boolean found = false;  //初始化
        char ch = '?';
        int pos = 0;
        while (!found && pos < str.length())    //若没有找到， 并且字符串没有被读取完，则开始运行
        {
            ch = str.charAt(pos);   //获取字符串的第一个字符，赋值给ch
            if (ch == 'x')      //若这个字符是x，则已找到，否则index+1,继续寻找
            {
                found = true;
            }
            else
            {
                pos++;
            }
        }
        if (found)
        {
            System.out.println("Found at " + pos);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
