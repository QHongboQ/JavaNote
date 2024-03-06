package zyBook_Chapter_4;

import java.util.Scanner;

/**
 * 检测单词中有几个元音字母
 * if后可加一个空格
 * 先从输入的单词中获取字符，从第零个开始获取到最后一个
 * 每一个字符和aeiou对比，检查是否为其中之一
 * "String".contains(char) 可检测数组里面是否包含char字符
 */
public class zyBook_4_10_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int count = 0;
        for (int i = 0; i < word.length(); i++)
        {
            String ch = word.substring(i, i + 1);
            if ("aeiou".contains(ch))
            {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}
