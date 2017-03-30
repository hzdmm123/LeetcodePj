import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/28
 * 题目描述
 给定n个字符串，请对n个字符串按照字典序排列。
 输入描述:
 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。


 输出描述:
 数据输出n行，输出结果为按照字典序排列的字符串。

 输入例子:
 9
 cap
 to
 cat
 card
 two
 too
 up
 boat
 boot

 输出例子:
 boat
 boot
 cap
 card
 cat
 to
 too
 two
 up.
 */
public class MaxStrDictnoary_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] ss = new String[num];
        for (int i=0;i<num;i++){
            ss[i] = sc.next();
        }
        Arrays.sort(ss);
        for (String s : ss){
            System.out.println(s);
        }
    }
}
