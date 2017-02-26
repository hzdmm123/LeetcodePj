package Array;

/**
 * Created by hzdmm on 2017/2/13.
 * /*
 *题目:Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Find the minimum element.
 *思路：排序？二分？、、不会就画一张图试试看
 */

public class FindMinimuminRotatedSortedArray153 {
    public int findMin(int[] nums){
        if (nums==null||nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int low=0,high=nums.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if (nums[low]<nums[mid] && nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return nums[low];
    }
}
