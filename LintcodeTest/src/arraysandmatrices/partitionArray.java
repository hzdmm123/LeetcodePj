package arraysandmatrices;

/**
 * Created by hzdmm on 2017/9/28.
 * 分割一个整数数组，使得奇数在前偶数在后。
 */
public class partitionArray {
    public void partitionArray(int[] nums) {
        if(nums == null || nums.length <= 1)
            return;

        int left = 0;
        int i = 0;
        int right = nums.length - 1;

        while(i <= right){
            if(nums[i] % 2 == 1){
                swap(nums, i++, left++);
            }
            else{
                swap(nums, i, right--);
            }
        }

        return;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
}
