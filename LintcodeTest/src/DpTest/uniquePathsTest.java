package DpTest;

/**
 * Created by hzdmm on 2017/9/7.
 */
public class uniquePathsTest {
    public static int uniquePaths(int m, int n) {
        if (m==1||n==1){
            return 1;
        }
        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }

    public static int uniquePaths_II(int m,int n){
        if(m==1||n==1){
            return 1;
        }
        int[][] dp=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                dp[i][j]=1;
            }
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
    }
}
