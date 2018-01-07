package swordoffer.P_2017_11_30;

/**
 * Created by hzdmm on 2017/11/30.
 */
public class FindIn2DArray_1 {
    public boolean find(int val, int[][] nums){
        int len = nums.length-1;
        int i=0;
        while (len>0&&i<nums[0].length){
            if (nums[len][i]>val){
                len--;
            }else if (nums[len][i]<val){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
