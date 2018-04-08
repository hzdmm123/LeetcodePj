package twoPointer;

/**
 * Created by hzdmm on 2017/9/30.
 * 给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。

 不要使用额外的数组空间，必须在原地没有额外空间的条件下完成。

 样例
 给出数组A =[1,1,2]，你的函数应该返回长度2，此时A=[1,2]。
 */
public class removeDuplicates {


    public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length<=1){
            return nums.length;
        }
         int index=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}

