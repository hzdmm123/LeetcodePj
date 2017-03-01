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
        int[] arr={1,2,5,4,6,2,4,7,8,4};
        System.out.print(Arrays.toString(list(arr)));
    }
}
