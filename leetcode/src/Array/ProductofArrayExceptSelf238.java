package Array;

/**
 * Created by hzdmm on 2016/10/23.
 */
public class ProductofArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length<2){
            return nums;
        }//检查输入

        int n = nums.length;
        int[] res = new int[n];
        res[0] =1;
        for (int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1];
        }//把当前值左半部分的乘积放到数组中去

        int right = 1;
        for (int i=n-1;i>=0;i--){
            res[i] *=right;//左半部分的乘积和右半部分的乘积为所求
            right*=nums[i];//右半部分的成绩
        }
        return res;
    }


}
