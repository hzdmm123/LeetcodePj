/**
 * Created by hzdmm on 2016/10/21.
 */
public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        if (nums==null || nums.length==0){
                return;
        }
        int insertport=0;
        for (int num:nums
             ) {
            if (num!=0){
                nums[insertport++]=num;

            }

        }
        while (insertport<nums.length){
            nums[insertport]=0;
            insertport++;
        }

    }
}
