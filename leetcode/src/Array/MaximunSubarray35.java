package Array;

/**
 * Created by hzdmm on 2017/2/13.
 */
public class MaximunSubarray35 {
    public int maximunSubarray(int[] nums) {
        int res = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) sum = 0;//归零
            if (sum > res) res = sum;
        }
        if (res == 0) {//都是负数的情况下
            res = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (res < nums[i]) res = nums[i];
            }
        }
        return res;
    }
}
