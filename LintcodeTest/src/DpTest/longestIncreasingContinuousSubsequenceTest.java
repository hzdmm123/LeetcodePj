package DpTest;

/**
 * Created by hzdmm on 2017/9/7.
 */
public class longestIncreasingContinuousSubsequenceTest {
    public static int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        int[] dp= new int[A.length];
        int[] dp2 = new int[A.length];
        int maxLen= 0;
        int maxLen2= 0;
        for (int i=0; i<dp.length; i++) {
            dp[i]=1;
            dp2[i]=1;
            for (int j=0; j<i; j++ ) {
                if (A[i]>A[j]) {
                    dp[i]= Math.max(dp[i],dp[j]+1);
                }
            }
            for (int j=0; j<i; j++) {
                if (A[i]<A[j]) {
                    dp2[i]=Math.max(dp2[i],dp2[j]+1);
                }
            }
            if (dp2[i]>maxLen2) {
                maxLen2=dp2[i];
            }
            if (dp[i]>maxLen) {
                maxLen=dp[i];
            }
        }
        return maxLen>maxLen2 ? maxLen : maxLen2;
    }

    public static void main(String[] args) {
        int[] testArray = {99,55,7,29,80,33,19,23,6,35,40,27,44,74,5,17,52,36,67,32,37,42,18,77,66,62,97,79,60,94,30,2,85,22,26,91,3,16,
                8,0,48,93,39,31,63,13,71,58,69,50,21,70,61,43,12,88,47,45,72,76};
        System.out.println(longestIncreasingContinuousSubsequence((testArray)));
    }
}
