package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzdmm on 2016/10/29.
        * 思路：把值作为key塞到hashmap里面然后如果出现重复的值hashmap的size就不可能等于我们的数组的长度。
        *
        */
public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        Map amap = new HashMap();
        for (int i=0;i<nums.length;i++){
            amap.put(nums[i],i);
        }
        if (amap.size()!=nums.length){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(containsDuplicate(nums));
    }
}
// not discussed
