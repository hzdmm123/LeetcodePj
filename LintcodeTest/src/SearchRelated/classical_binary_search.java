package SearchRelated;

/**
 * Created by hzdmm on 2017/10/23.
 */
public class classical_binary_search {
    /*
 * @param nums: An integer array sorted in ascending order
 * @param target: An integer
 * @return: An integer
 */
    public int findPosition(int[] nums, int target) {
        // write your code here
        if (target<nums[0]||target>nums[nums.length-1]){
            return -1;
        }
        int left =0;
        int right = nums.length;
        while (left+1<right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                right=mid;
            }else if(nums[mid]<target){
                left=mid;
            }
        }
        if (nums[left]==target){
            return left;
        }
        if (nums[right]==target){
            return right;
        }
        return -1;
    }
}
