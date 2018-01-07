package Blog_2017_11_27;

/**
 * Created by hzdmm on 2017/11/27.
 */
public class SingleNumber {
    /**
     * 找到int数组中都出现两次的数字中找到只出现一次的数字
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i=1;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }

    public int singleNumber_ii(int[] nums) {
        int ans = 0;
        for (int i=0;i<32;i++){
            int sum=0;
            for (int j=0;j<nums.length;j++){
                if ((nums[j]>>i&1)==1){
                    sum++;
                    sum%=3;
                }
            }

            if (sum != 0){
                ans |= sum << i;
            }
        }
        return ans;
    }

    public int[] singleNumber_iii(int[] nums){
        int diff=0;
        for (int num : nums){
            diff ^= num;
        }

        diff &=-diff;

        int[] res = {0,0};
        for (int num : nums){
            if ((num & diff)==0){
                res[0] ^=num;
            }else {
                res[1] ^=num;
            }
        }
        return res;
    }

}
