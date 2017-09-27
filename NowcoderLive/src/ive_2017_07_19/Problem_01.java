package ive_2017_07_19;

/**
 * Created by hzdmm on 2017/7/29.
 * 1、已知一个字符串都是由左括号(和右括号)组成，判断该字符串是否是有效的括号组合。

 例子：
 有效的括号组合:()(),(()),(()())
 无效的括号组合:(,()),((),()(()

 */
public class Problem_01 {
    private static boolean isValiad(String a){
        if (a==null){
            return false;
        }
        int status=0;
        char[] chas = a.toCharArray();
        for (int i=0;i<chas.length;i++){
            if (chas[i] != '(' && chas[i] != ')'){
                return false;
            }
            if (chas[i]=='('){
                status++;
            }else {
                status--;
            }
            if (status<0){
                return false;
            }
        }

        return status==0;
    }


    public static int maxLength(String str){
        if (str==null||str==""){
            return 0;
        }
        char[] chas = str.toCharArray();
        int[] dp = new int[chas.length];
        int pre = 0;
        int res = 0;
        for (int i=1;i<chas.length;i++){
            if (chas[i]==')'){
                pre = i - dp[i-1]-1;
                if (pre >=0&&chas[pre]=='('){
                    dp[i] = dp[i-1]+2+(pre>0?dp[pre-1]:0);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }


    public static void testIs(){
        System.out.println(isValiad("()(()"));
    }
    public static void main(String[] args) {
        testIs();
    }
}
