package twoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzdmm on 2017/10/23.
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j),
 * where i and j are both numbers in the array and their absolute difference is k.
 * 给定一个数组和一个数字，求数组中有多少对差值为给定数字k，同样的数字算一次
 * Example 1:
 Input: [3, 1, 4, 1, 5], k = 2
 Output: 2
 Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 Although we have two 1s in the input, we should only return the number of unique pairs.
 Example 2:
 Input:[1, 2, 3, 4, 5], k = 1
 Output: 4
 Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 Example 3:
 Input: [1, 3, 1, 5, 4], k = 0
 Output: 1
 Explanation: There is one 0-diff pair in the array, (1, 1).
 * */
public class K_diffPairsinanArray_532 {
    public int findPairs(int[] nums, int k) {
        if (nums==null||nums.length==0||k<0){
            return 0;
        }
        Arrays.sort(nums);//先排序
        int count=0;
        int left=0;int right=1;
        while (right<nums.length){
            if (nums[right]-nums[left]>k){
                left++;//差值大于k left++ 缩小差值
            }else if (nums[right]-nums[left]<k){
                right++;//扩大差值
            }else {
                count++;//成功一个
                left++;//后移
                right++;
                while (left<nums.length&&nums[left]==nums[left-1]){
                    left++;//处理多个重复值的情况
                }
                while (right<nums.length&&nums[right]==nums[right-1]){
                    right++;
                }

            }
            if (left==right){
                right++;
            }
        }
        return count;
    }

    public int findPairs_II(int[] nums,int k){
        int count=0;
        if (nums==null||nums.length<1||k<0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap();
        for (int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (k==0){
                if (entry.getValue()>=2){
                    count++;
                }
            }else {
                if (map.containsKey(entry.getValue()+k)){
                    count++;
                }
            }
        }
        return count;
    }
}
