package DP;

/**
 * Created by hzdmm on 2017/3/25.
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber_198 {
    public int help1(int idx,int[] nums){
        if (idx<0){
            return 0;
        }

        return Math.max(nums[idx]+help1(idx-2,nums),help1(idx-1, nums));//不抢最后一个或者抢最后一个的两种方案
        //求出来比较大的哪一种方案就是决策的最大值
    }


    public int rob1(int[] nums) {
        return help1(nums.length-1,nums);//递归暴力搜索解法
    }


    public int help2(int idx,int[] nums){
        if (idx<0){
            return 0;
        }

        if (result[idx]>0){
            return result[idx];//表明已经计算过了
        }

        result[idx]= Math.max(nums[idx]+help2(idx-2,nums),help2(idx-2, nums));//不抢最后一个或者抢最后一个的两种方案
        //求出来比较大的哪一种方案就是决策的最大值
        return result[idx];
    }


    public int rob2(int[] nums) {
         result = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            result[i] = -1;
        }
        return help2(nums.length-1,nums);//
    }

    public static int[] result;//保存下来结果的东西 去除冗余的地方

    public int rob3(int[] nums){
        result = new int[nums.length];
        if (nums.length==0){
            return 0;
}
        if (nums.length==1){
                return nums[0];
                }
                result[0]=nums[0];
                result[1]=Math.max(nums[0],nums[1]);
                for (int idx = 2;idx<nums.length;idx++){
                result[idx]= Math.max(nums[idx]+result[idx-2],result[idx-1]);//不抢最后一个或者抢最后一个的两种方案
        //求出来比较大的哪一种方案就是决策的最大值
        }

        return result[nums.length-1];
        }
}
