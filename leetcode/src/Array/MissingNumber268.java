package Array;

import java.util.Arrays;

/**
 * Created by hzdmm on 2016/10/30.
 * 思路1：利用求和的方法求0-n的值，然后减去数组累加值，得到的结果就是missing的值
 * 思路2：使用xor运算符，具体的不是很懂。(多个数的异或满足互换性，任何数和0异或还是本身，本身和本身异或是0)
 * 思路3：使用二分查找的方法(使得数组有序)主要第一种方法有可能会溢出
 */
public class MissingNumber268 {
    public  int missingNumber(int[] nums){
        int n=nums.length;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return n*(n+1)/2-sum;
    }

    public int missingNumber2(int[] nums){
        int n=nums.length;
        int result=n;
        for (int i=0;i<n;i++){
            result ^=i;
            result ^=nums[i];
        }
        return result;
    }

    public int missingNumber3(int[] nums){
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid= (left + right)/2;
        while(left<right){
            mid = (left + right)/2;
            if(nums[mid]>mid) right = mid;
            else left = mid+1;
        }
        return left;

    }

}
