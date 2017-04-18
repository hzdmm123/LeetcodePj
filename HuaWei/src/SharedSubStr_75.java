import java.util.Scanner;

/**
 * 题目标题：
 计算两个字符串的最大公共字串的长度，字符不区分大小写
 详细描述：
 接口说明
 原型：
 int getCommonStrLength(char * pFirstStr, char * pSecondStr);
 输入参数：
 char * pFirstStr //第一个字符串
 char * pSecondStr//第二个字符串


 输入描述:
 输入两个字符串


 输出描述:
 输出一个整数

 输入例子:
 asdfas werasdfaswer

 输出例子:
 6
 * Created by hzdmm on 2017/3/31.
 */
public class SharedSubStr_75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            char[] str1 = scanner.next().toLowerCase().toCharArray();
            char[] str2 = scanner.next().toLowerCase().toCharArray();
            System.out.println(getdp(str1,str2));
        }
    }
    public static int getdp(char[] str1,char[] str2){
        int[][] dp = new int[str1.length][str2.length];
        for (int i=0;i<str1.length;i++){
            if (str1[i]==str2[0]){
                dp[i][0]=1;
            }
        }
        for (int i=0;i<str2.length;i++){
            if (str1[0]==str2[i]){
                dp[0][i]=1;
            }
        }
        int max=0;
        for (int i=1;i<str1.length;i++){
            for (int j=1;j<str2.length;j++){
                if (str1[i] == str2[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if (dp[i][j]>max){
                        max=dp[i][j];
                    }
                }
            }
        }
        return max;
    }
}
