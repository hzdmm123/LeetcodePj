import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。

 输入描述:
 输入N个字符，字符在ACSII码范围内。


 输出描述:
 输出范围在(0~127)字符的个数。

 输入例子:
 abc

 输出例子:
 3
 */
public class NumOfChar_10 {
    public static void main(String[] args) {
        boolean[] res = new boolean[128];
        for (int i=0;i<res.length;i++){
            res[i]=false;
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            for (int i=0;i<s.length();i++){
            if (res[s.charAt(i)]==false){
                res[s.charAt(i)]=true;
            };
            }
        }
        int count=0;
        for (int i=0;i<res.length;i++){
            if (res[i]==true){
                count++;
            }
        }
        System.out.println(count);
    }
}
