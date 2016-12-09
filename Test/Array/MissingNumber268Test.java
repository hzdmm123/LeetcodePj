package Array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hzdmm on 2016/10/30.
 */
public class MissingNumber268Test {
    @Test
    public void missingNumber() throws Exception {
        MissingNumber268 ma = new MissingNumber268();
        int[] nums={1};
        assertEquals(0,ma.missingNumber(nums));
        int[] nums1={0};
        assertEquals(1,ma.missingNumber2(nums1));
        int[] nums2={0,8,5,4,2,1,3,7,6};
        assertEquals(9,ma.missingNumber3(nums2));
    }

}