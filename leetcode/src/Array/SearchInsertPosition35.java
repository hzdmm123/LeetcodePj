package Array;

/**思路：用二分查找去做
 * Created by hzdmm on 2017/2/13.
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition35 {
    public int searchInsertPosition(int[] nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
