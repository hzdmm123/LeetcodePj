package DP;

/**
 * Created by hzdmm on 2017/4/17.
 */
public class MinimumPathSum_64 {
    public static int minPathSum(int[][] grid) {
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (i>0&&j>0){
                    grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
                }
                if (i>0&&j==0){
                    grid[i][j]+=grid[i-1][j];
                }
                if (j>0&&i==0){
                    grid[i][j]+=grid[i][j-1];
                }

            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] grid={{1,4,8,6,2,2,1,7},{4,7,3,1,4,5,5,1},{8,8,2,1,1,8,0,1},{8,9,2,9,8,0,8,9},{5,7,5,7,1,8,5,5},{7,0,9,4,5,6,5,6},{4,9,9,7,9,1,9,0}};
        System.out.println(minPathSum(grid));
    }
}
