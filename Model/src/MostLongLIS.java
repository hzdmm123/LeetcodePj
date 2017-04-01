import java.util.Map;

/**
 * Created by hzdmm on 2017/3/30.
 * 最长递增子序列
 *
 */

/**
 * 第一步求dp数组 以i结尾的dp[i]是dp[i]或者dp[j]+1 j的条件是arr的值必须比i小
 */
public class MostLongLIS {
    public int[] getDp(int[] arr){
        int[] dp = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            dp[i]=1;
            for (int j=0;j<i;j++){
                if (arr[j]<arr[i]){//以i结尾的数字的dp的长度是前面一个的加一或者就是本身
                    dp[i]= Math.max(dp[i],dp[j]+1);
                }
            }

        }

        return dp;
    }

    public int [] generateLIS(int[] arr,int[] dp){
        //1.在dp中找到最长的数字的值,记录下
        int len=0;
        int index =0;
        for (int i=0;i<dp.length;i++){
            if (dp[i]>len){
                len=dp[i];
                index=i;
            }
        }
        int[] lis = new int[len];
        lis[--len]=arr[index];
        for (int i=index;i>=0;i--){
            if (arr[i]<arr[index]&&dp[i]==dp[index]-1){
                lis[--len]=arr[i];
                index=i;
            }
        }
        return lis;

    }
}
