package O_N;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2017/8/31.
 *
 Given an array of integers,
 every element appears three times except for one.
 Find that single one
 */
public class singleNumber_ll {
    public int singleNumber(int[] nums) {
        int res=0;
        for (int i=0;i<32;i++){//int 32 位
            int sum = 0;
            for (int j=0;j<nums.length;j++){
                sum += (nums[j]>>i)&1;//每一位上1出现的次数
            }
            res |=(sum%3) << i;//出招出现一次的那个i
        }
        return res;
    }

}
