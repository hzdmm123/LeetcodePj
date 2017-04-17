package DP;

/**
 * Created by hzdmm on 2017/4/17.
 */
public class TargetSum_494 {
    public int result;
    public int findTargetSumWays(int[] nums, int S) {
        dfs(0,0,S,nums);
        return result;
    }

    public void dfs(int sum,int index,int S,int[] nums){
        if (index==nums.length){
            if (sum==S){
                result++;
            }
            return;
        }
        dfs(sum+nums[index],index+1,S,nums);
        dfs(sum-nums[index],index+1,S,nums);
    }
}
