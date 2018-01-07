package swordoffer.P_2017_12_7;

/**
 * Created by hzdmm on 2017/12/7.
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] nums){
        if (nums==null){
            return 0;
        }
        int current = -1;
        int sum = -1;
        for (int i=0;i<nums.length;i++){
            if (current<=0){//前面的一段连续是负数（不需要了）
                current = nums[i];
                continue;
            }
            current= current+nums[i];

            if (current>sum){
                sum = current;//保存MaxSum
            }
        }
        //防止都是负数的情况
        for (int i=0;i<nums.length;i++){
            if (sum<nums[i]){
                sum = nums[i];
            }
        }
        return sum;
    }
}
