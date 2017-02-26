package Array;

/**
 * Created by hzdmm on 2016/10/29.
 * 思路：因为主元素是肯定超过一半的，那么把主元素和非主元素两两相对的来看，那么我们可以利用计数器
 * 首先我们先设置第一个元素为主元素，如果我们遍历到的下一个数字还是它我们给他加上1，否则我们就减去1.但我们再次碰到
 * 我们的计数器是0的时候，那我们就能知道把i+1个元素设置为我们的主元素然后继续上面的遍历，直到结束。
 */

public class MajorityElement169 {
    public static int majorityElement(int[] nums) {
        int majornum=0;
        int count=0;
        int n = nums.length-1;
        for (int i=0;i<=n;i++){
            if (count==0) {
                majornum = nums[i];
            }//以上是我们设置主元素
            if (majornum==nums[i]){
                count++;//遇到相同的数
            }else if (majornum!=nums[i]){
                count--;//遇到不同的数字
            }
        }
        if (count>=0){
            return majornum;//最后保留的数字
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums={3,3,4};
        System.out.println(majorityElement(nums));

    }
}
//not discussed
