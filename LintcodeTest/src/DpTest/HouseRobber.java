package DpTest;

/**
 * Created by hzdmm on 2017/9/27.
 */
public class HouseRobber {
    public long houseRobber(int[] A) {
        return help(A,A.length-1);
    }

    private int help(int[] nums, int index) {
        if (index<0) return 0;
        return Math.max(nums[index]+help(nums,index-2),help(nums,index-1));
    }

    public long houseRobberII(int[] A){
        long[] result = new long[A.length];
        if (A.length==0){
            return 0;
        }
        if (A.length==1){
            return A[0];
        }

        if (A.length==2){
            return Math.max(A[0],A[1]);
        }
        result[0]=A[0];
        result[1]=Math.max(A[0],A[1]);
        for (int i=2;i<A.length;i++){
            result[i]=Math.max(result[i-1],result[i-2]+A[i]);
        }
        return result[A.length-1];
    }
}
