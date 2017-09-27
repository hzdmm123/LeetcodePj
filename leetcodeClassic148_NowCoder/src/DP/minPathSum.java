package DP;

/**
 * Created by hzdmm on 2017/9/2.
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes t
 * he sum of all numbers along its path.
 Note: You can only move either down or right at any point in time.
 */
public class minPathSum {
    public static int minPathSum(int[][] grid) {
        if (grid==null){
            return 0;
        }
        return help(grid,grid.length-1,grid[0].length-1);

    }

    private static int  help(int[][] grid, int i, int j) {
        if (i==0&&j==0){
            return grid[i][j];
        }else if (i==0&&j>0){
            return grid[i][j]+help(grid,0,j-1);
        }else if(j==0&&i>0){
            return grid[i][j]+help(grid,i-1,0);
        }
        return Math.min(grid[i][j]+help(grid,i-1,j),grid[i][j]+help(grid,i,j-1));

    }

    public static void main(String[] args) {
        int[][] grid = {{1,1},{2,1},{3,4}};
        //System.out.println(grid.length);
        //System.out.println(grid[0].length);
        System.out.println(minPathSum(grid));
    }

    private int[][] path;
    public static int minPathSum_II(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp= new int[m][n];

        dp[0][0] = grid[0][0];
        for (int i=1;i<m;i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }

        for (int j=1;j<n;j++){
            dp[0][j] = dp[0][j-1]+grid[0][j];
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j] = Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);
            }
        }
        return dp[m-1][n-1];
    }
}
