package leetcode.dp;

/**
 * Created by hzdmm on 2017/8/1.
 */
public class HouseBobber {
    //纯暴力递归
    public int robber1(int[] nums){
        return help1(nums.length-1,nums);
    }

    private int help1(int idx, int[] nums) {
        if (idx<0){//递归返回的重要条件
            return 0;
        }
        return Math.max(nums[idx]+help1(idx-2,nums),help1(idx-1,nums));//暴力搜索递归
    }

    //如何根据上述的暴力递归优化。开个记录用的空间.用一个中间数组来记录每次递归的过程中获得

    int[] result;//记录的数组
    public int robber2(int[] nums){
        result = new int[nums.length];
        for (int i=0;i<result.length;i++){
            result[i]=-1;
        }

        return help2(nums.length-1, nums);
    }
    private int help2(int idx,int[] nums) {
        if (idx<0){
            return 0;
        }

        if (result[idx]>0){
            return result[idx];
        }

        result[idx] = Math.max(nums[idx]+help2(idx-2,nums),help2(idx-1,nums));
        return result[idx];

    }
    //目前的最优解
    public int robber3(int[] nums){
        result = new int[nums.length];
        if (nums.length==0){
            return result[0];
        }
        if (nums.length==1){
            return result[0]>result[1]?result[0]:result[1];
        }

        for (int i=2;i<nums.length;i++){
            result[i] = Math.max(nums[i]+result[i-2],result[i-1]);
        }

        return result[nums.length-1];
    }

}
