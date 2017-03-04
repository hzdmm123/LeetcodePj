package Unit_04;

/**
 * Created by hzdmm on 2017/2/26.
 */
public class Problem_U4_04_SumsOfSwitchMoney3 {
    public static int coins(int num[],int aim){
        if (num==null ||num.length==0 || aim<0){
            return 0;
        }//判断当年的参数是否有有效
        int[][] dp = new int[num.length][aim+1];//开辟dp存储数组，dp[i][j]表示的是使用0-i个货币的情况下能组成的钱的总类的数
        for (int i=0;i<num.length;i++){
            dp[i][0]=1;//第一列组成o的情况都只有一种，就是什么货币都没有
        }
        for (int i=1;num[0]*i<aim;i++){
            dp[0][i]=i;//第一一种货币能组成的钱的数目
        }
        int temp=0;
        for (int i=1;i<num.length;i++){
            for (int j =1;j<=aim;j++){
                temp = 0;
                for (int k=0;j-k*num[i]>=0;k++){
                    temp+=dp[i-1][j-num[i]*k];//根据公式推导公式如果
                }
                dp[i][j]=temp;
            }
        }
        return dp[num.length-1][aim];
    }

    public static void main(String[] args) {
        int[] num={5,10,25,1};
        System.out.println(coins(num,15));
    }
}
