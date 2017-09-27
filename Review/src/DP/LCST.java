package DP;

/**
 * Created by hzdmm on 2017/4/7.
 * 最长公共子序列
 */
public class LCST {
    public int[][] getdp(char[] str1,char[] str2){
        int[][] dp = new int[str1.length][str2.length];
        for (int i=0;i<str1.length;i++){
            if (str1[i]==str2[0]){
                dp[i][0]=1;
            }
        }

        for (int i=0;i<str2.length;i++){
            if (str2[i]==str1[0]){
                dp[0][i]=1;
            }
        }

        for(int i=1;i<str1.length;i++){
            for (int j=1;j<str2.length;j++){
                if (str1[i]==str2[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
            }
        }
        return dp;
    }
}
