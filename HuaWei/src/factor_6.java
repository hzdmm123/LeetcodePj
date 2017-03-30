import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 * 题目描述
 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 最后一个数后面也要有空格

 详细描述：

 函数接口说明：
 public String getResult(long ulDataInput)
 输入参数：
 long ulDataInput：输入的正整数
 返回值：
 String



 输入描述:
 输入一个long型整数


 输出描述:
 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。

 输入例子:
 180

 输出例子:
 2 2 3 3 5
 */
public class factor_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long num = in.nextLong();
            String str = getResult(num);
            System.out.println(str);
            }
        }

    private static String getResult(long num) {
        StringBuilder sb = new StringBuilder();
        while (num!=1){
            for (int i=2;i<=num;i++){
                if (num%i==0){
                    num = num/i;
                    sb.append(i).append(" ");
                    break;
                }
            }
        }
        return sb.toString();
    }

}
