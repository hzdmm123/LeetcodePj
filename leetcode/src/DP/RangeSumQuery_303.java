package DP;

/**
 * Created by hzdmm on 2017/9/2.
 * Given an integer array nums,
 * find the sum of the elements between indices i and j (i ≤ j), inclusive.
 *
 Given nums = [-2, 0, 3, -5, 2, -1]

 sumRange(0, 2) -> 1
 sumRange(2, 5) -> -1
 sumRange(0, 5) -> -3*/
public class RangeSumQuery_303 {
    int[] sum;//统计的所有和的的数组
    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(i,j);
     */
    public RangeSumQuery_303(int[] nums) {
        if (nums.length>0){
            sum= new int[nums.length];
            sum[0]=nums[0];
            for (int i=1;i<nums.length;i++){
                sum[i]=sum[i-1]+nums[i];
            }
        }//做的累加合
    }


    public int sumRange(int i, int j) {

        if (i==0){
            return sum[j];
        }else {
            return sum[j]-sum[i-1];
        }
    }
}
