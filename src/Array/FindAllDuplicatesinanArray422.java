package Array;

import java.util.*;

/**
 * Created by hzdmm on 2016/11/18.
 * 在一个数组寻找出所有重复的值，利用map和set。但是超过空间限制了。
 */
public class FindAllDuplicatesinanArray422 {
    public List<Integer> findDuplicates(int[] nums) {
        //方法1
/*        Set map = new HashSet();
        List ls = new ArrayList();
        for (int i=0;i<nums.length;i++){
         if (map.contains(nums[i])){
             ls.add(nums[i]);
         }
         map.add(nums[i]);
        }
        return ls;*/
//方法2
     /*   List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;*/
        List ls = new ArrayList();
        for (int i=0;i<nums.length;++i){
            int val = Math.abs(nums[i])-1;
            if (val<0){
                ls.add(nums[val]-1);
            }
            nums[val]=-nums[val];
        }
        return ls;
    }
}
