package DpTest;

/**
 * Created by hzdmm on 2017/9/7.
 * 最长上升连续子序列
 */
public class longestIncreasingContinuousSubsequenceTest {
    public static int longestIncreasingContinuousSubsequence(int[] A) {
        if (A==null||A.length==0){
            return 0;
        }

        if (A.length==1){
            return 1;
        }

        int res = 1;
        int[] l2r = new int[A.length];
        int[] r2l = new int[A.length];
        l2r[0]=1;
        for (int i=1;i<A.length;i++){
            if (A[i]>A[i-1]){
                l2r[i]=l2r[i-1]+1;
                if (l2r[i]>res){
                    res = l2r[i];
                }
            }else {
                l2r[i]=1;
            }
        }
        r2l[A.length-1]=1;
        for (int i=A.length-2;i>=0;i--){
            if (A[i]>A[i+1]){
                r2l[i]=r2l[i+1]+1;
                if (r2l[i]>res){
                    res=r2l[i];
                }
            }else {
                r2l[i]=1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] testArray = {99,55,7,29,80,33,19,23,6,35,40,27,44,74,5,17,52,36,67,32,37,42,18,77,66,62,97,79,60,94,30,2,85,22,26,91,3,16,
                8,0,48,93,39,31,63,13,71,58,69,50,21,70,61,43,12,88,47,45,72,76};
        System.out.println(longestIncreasingContinuousSubsequence((testArray)));
    }
}
