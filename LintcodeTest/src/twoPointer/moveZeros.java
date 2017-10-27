package twoPointer;

/**
 * Created by hzdmm on 2017/9/30.
 * 给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序

 注意事项

 1.必须在原数组上操作
 2.最小化操作数
 样例
 给出 nums = [0, 1, 0, 3, 12], 调用函数之后, nums = [1, 3, 12, 0, 0].
 */
public class moveZeros {
    public void moveZeroes(int[] nums) {
        // write your code here
        int fast=0,slow=0;
        int n = nums.length;

        while (fast<n){
            if (nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }

        for (int i=slow;i<n;i++){
            nums[i]=0;
        }
    }
}
