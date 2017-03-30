import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/30.
 */
public class chorus_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int[] arr = new int[in.nextInt()];
            for (int i=0;i<arr.length;i++){
                arr[i]= in.nextInt();
            }
            int[] res1= getdp1(arr);
            int[] res2 = getdp2(arr);
            for (int i=0;i<res1.length;i++){
                System.out.print(res1[i]+"**");
            }
            System.out.println("");
            for (int i=0;i<res2.length;i++){
                System.out.print(res2[i]+"**");
            }
            int sum=0;
            for (int i=0;i<arr.length;i++){
                if (res1[i]+res2[i]>sum){
                    sum=res1[i]+res2[i];
                }
            }
            System.out.println(arr.length-sum+1);
        }

    }
    //正向的最长递增子序列的dp数组
    public static int[] getdp1(int[] arr){
        int[] dp = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            dp[i]= 1;
            for (int j = 0;j<i;j++){
                if (arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;
    }//逆向的最长递增子序列
    public static int[] getdp2(int[] arr){
        int[] dp = new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            dp[i]= 1;
            for (int j = arr.length-1;j>i;j--){
                if (arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;
    }
}
