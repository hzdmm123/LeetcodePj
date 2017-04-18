package DP;

/**
 * Created by hzdmm on 2017/4/18.
 */
public class LongestIncreasingSubsequence_300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=1;
        int max = 0;
        for (int i=1;i<nums.length;i++){
            dp[i]=1;
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                    if (max<dp[i]){
                        max = dp[i];
                    }
                }
            }
        }
        return max;
    }
}
