package Array;

/**
 * Created by hzdmm on 2016/11/3.
 */
//思路：快慢指针第一次相遇证明有环，第二次找到环的路口，就是重复的数字
    //第二次把快指针放到远点，慢指针还在第一次相遇的点以相同的速度走，碰到一起就是入口

public class FindtheDuplicateNumber287 {
    public int findDuplicate(int[] nums) {
        if (nums.length>0){
            int n = nums.length-1;
            int fast=nums[nums[n-1]];
            int slow = nums[n-1];
            while(slow!=fast){
                fast=nums[nums[fast]];
                slow =nums[slow];
            }
            fast=nums[n-1];
            while (slow!=fast){
                fast=nums[fast];
                slow= nums[slow];
            }
            return slow;

        }
        return -1;

    }
}
//参考：http://www.cnblogs.com/hxsyl/p/4395794.html
//----http://blog.csdn.net/imzoer/article/details/8030297