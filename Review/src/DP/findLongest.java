package DP;

/**
 * Created by hzdmm on 2017/4/16.
 * 最长递增子序列
 */
public class findLongest {
    public int findLongest(int[] A, int n) {
        int[] dp = new int[n];
        int max=0;
        for (int i=0;i<n;i++){
            dp[i]=0;
            for (int j=0;j<i;j++){
                if (A[i]>A[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                if (dp[i]>max){
                    max=dp[i];
                }
            }
        }
        return max;
    }

}
