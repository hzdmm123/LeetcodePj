package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hzdmm on 2017/2/13.
 *所有想的到思路：先申请一个新的数组把原数组的值都塞到新的数组中，新数组的初始值都是-1,然后遍历所得的数组如果值是-1的就假如list。
 *符合要求的思路：把原来数组的值都减去1，将所得值作为索引（确实的索引就是结果），标记索引上的值为负数，遍历原来的数组所得的值是正数字表示
 * 该索引不在数组的值转换的索引中加1就是原始值。
 */

public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            int val = Math.abs(nums[i])-1;
            if (nums[val]>0){
                nums[val]=-nums[val];
            }
        }

        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                res.add(i+1);
            }
        }
        return res;


    }
}
