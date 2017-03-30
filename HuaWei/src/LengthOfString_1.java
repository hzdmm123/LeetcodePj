import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 * 题目描述
 计算字符串最后一个单词的长度，单词以空格隔开。

 输入描述:
 一行字符串，非空，长度小于5000。


 输出描述:
 整数N，最后一个单词的长度。

 输入例子:
 hello world

 输出例子:
 5
 */
public class LengthOfString_1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str="";
        while (in.hasNext()){
             str= in.nextLine();
        }
        String[] res = str.split(" ");
        System.out.println(res[res.length-1].length());

    }
}
