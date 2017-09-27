package DP;

/**
 * Created by hzdmm on 9/2/2017.
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 For example,
 Given:
 s1 ="aabcc",
 s2 ="dbbca",
 When s3 ="aadbbcbcac", return true.
 When s3 ="aadbbbaccc", return false.
 */
public class InterleavingString {
    public static boolean isInterleave(String s1, String s2, String s3) {

        if(s3 == null && (s1 != null || s2 != null)) return false;
        if((s1 == null && s2 == null) && s3 != null)  return false;
        if (s1.length()==0){}
        if (s1==null&&s2==null&&s3==null){
            return true;
        }
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }
        int m = s1.length()+1;
        int n = s2.length()+1;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true;
        for(int i=1;i<m;i++){
            dp[i][0] = dp[i-1][0]&(s1.charAt(i-1)==s3.charAt(i-1));
        }

        for(int j=1;j<n;j++){
            dp[0][j]= dp[0][j-1]&(s2.charAt(j-1)==s3.charAt(j-1));
        }
        for (int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = (dp[i][j-1]&(s2.charAt(j-1)==s3.charAt(i+j-1)))||(dp[i-1][j]&(s1.charAt(i-1)==s3.charAt(i+j-1)));
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        String s1 = "q";
        String s2 = "";
        String s3 = "q";
        System.out.println(isInterleave(s1,s2,s3));
    }

    public static boolean isInterleave_II(String s1, String s2, String s3) {
        if (s1.length()==0&&s2.length()==0&&s3.length()==0) {
            return true;
        }
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }

        int m = s1.length();
        int n = s2.length();

        boolean[][] dp = new boolean[m][n];

        for (int i=0;i<m;i++ ) {
            for(int j=0;j<n;j++){
                if (i==0&&j==0) {
                    dp[0][0] = true;
                }else if (i==0&&j!=0) {
                    dp[0][j]=dp[0][j-1]&(s2.charAt(j-1)==s3.charAt(j-1));
                }else if (j==0&&i!=0) {
                    dp[i][0] = dp[i-1][0]&(s1.charAt(i-1)==s3.charAt(i-1));
                }else {
                    dp[i][j]=(dp[i-1][j]&(s1.charAt(i-1)==s3.charAt(i+j-1)))||(dp[i][j-1]&(s2.charAt(j-1)==s3.charAt(i+j-1)));
                }
            }
        }
        return dp[m-1][n-1];
    }
}
