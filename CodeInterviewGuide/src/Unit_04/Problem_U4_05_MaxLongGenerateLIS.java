package Unit_04;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/3/1.
 */
public class Problem_U4_05_MaxLongGenerateLIS {
    public static int[] getdp(int[] arr){//计算出dp数组
        int[] dp = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            dp[i]=1;
            for (int j=0;j<i;j++){
                if (arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);//o(n平方 )
                    //以i结尾的数组的dp[i]不是本省就是之前的j+
                }
            }
        }
        return dp;
    }

    public static int[] generateLIS(int[] arr,int[] dp){
        int len=0;
        int index=0;
        for (int i=0;i<dp.length;i++){
            if (dp[i]>len){
                len = dp[i];
                index = i;//找到最大的那个dp的值，并且记录下角标
            }
        }

        int[] lis = new int[len];//len的值就是最大的角标的值得也就是最长的递增序列的长度
        lis[--len]=arr[index];//最大的那个数放到最后去
        for (int i= index;i>=0;i--){
            if (arr[i]<arr[index]&&dp[i]==dp[index]-1){//从最后开始判断只要数组的值依次减小并且dp数组的值小1就可以加入到lis数组中区
                lis[--len] = arr[i];
                index = i;
            }
        }
        return lis;
    }


    public static int[] list(int[] arr){
        if (arr==null||arr.length==0){
            return null;
        }
        int[] lisdp = getdp(arr);
        return generateLIS(arr,lisdp);
    }

    public static void main(String[] args) {
        int[] arr={99,55,7,29,80,33,19,23,6,35,40,27,44,74,5,17,52,36,67,32,37,42,18,77,66,62,97,79,60,94,30,2,85,22,26,91,3,16,8,0,48,93,39,31,63,13,71,58,69,50,21,70,61,43,12,88,47,45,72,76};
        System.out.print(Arrays.toString(list(arr)));
    }
}
