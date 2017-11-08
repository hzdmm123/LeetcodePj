package Array;

/**
 * Created by hzdmm on 2017/11/7.
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class SortColors_75 {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int index=0;
        while (index<right){
            if (nums[index]==0){
                nums[index] = nums[left];
                nums[left] = 0;
                left++;//数字是抛出去的
            }

            if (nums[index]==2){
                nums[index] = nums[right];
                nums[right] = 2;
                right--;
                index--;//不知道换过来的是什么数字
            }

            index++;
        }
    }
}
