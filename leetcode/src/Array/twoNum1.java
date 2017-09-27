package Array;

import java.util.HashMap;

/**
 * Created by hzdmm on 2017/9/21.
 * Given an array of integers, return indices of the two numbers
 * such that they add up to a specific target.

 You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].*/
public class twoNum1 {
    public static int[] twoSum(int[] nums, int target)  {
       for (int i = 0; i <nums.length ; i++) {
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] twoSumII(int[] nums,int target){
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i=0;i<nums.length;i++){
            int TemTarget = target- nums[i];
            if (hashMap.containsKey(TemTarget)){
                return new int[]{hashMap.get(TemTarget),i};
            }
        }

        throw  new IllegalArgumentException("not");

    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int tar = 6;
        int[] res = twoSum(nums,tar);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
