package Unit_04;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/3/1.
 */
public class Problem_U4_05_MaxLongGenerateLIS_2 {
    public static int[] getdp(int[] arr){
        int[] dp = new int[arr.length];
        int[] ends = new int[arr.length];
        ends[0] = arr[0];
        dp[0] = 1;
        int right = 1;
        int l=0;
        int r = 0;
        int m= 0;
        for (int i=1;i<arr.length;i++){
            l=0;
            r=right;
            while (l<=r){
                m=(l+r)/2;
                if (arr[i]>ends[m]){
                    l=m+l;
                }else {
                    r = m-l;
                }
            }
            right = Math.max(right,l);;
            ends[i]=arr[i];
            dp[i]=i+1;
        }
        return dp;
    }

    public static int[] list(int[] arr){
        if (arr==null || arr.length==0){
            return null;
        }
        int[] dp = getdp(arr);
        return Problem_U4_05_MaxLongGenerateLIS.generateLIS(arr,dp);
    }


    public static void main(String[] args) {
        int[] arr={99,55,7,29,80,33,19,23,6,35,40,27,44,74,5,17,52,36,67,32,37,42,18,77,66,62,97,79,60,94,30,2,85,22,26,91,3,16,8,0,48,93,39,31,63,13,71,58,69,50,21,70,61,43,12,88,47,45,72,76};
        System.out.print(Arrays.toString(list(arr)));
    }
}
