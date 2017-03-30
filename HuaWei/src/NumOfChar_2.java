import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 * 题目描述
 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。

 输入描述:
 输入一个有字母和数字以及空格组成的字符串，和一个字符。


 输出描述:
 输出输入字符串中含有该字符的个数。

 输入例子:
 ABCDEF
 A

 输出例子:
 1
 */
public class NumOfChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="";
        char target;
        str = sc.nextLine().toUpperCase();
        target = sc.nextLine().toUpperCase().toCharArray()[0];
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==target){
                count++;
            }
        }
        System.out.println(count);



    }
}
