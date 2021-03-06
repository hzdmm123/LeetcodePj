package DP;

/**
 * Created by hzdmm on 2017/4/18.
 */
public class UniquePaths_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                }else if (i==0&&j==0){
                    obstacleGrid[i][j]=1;
                }else if (i==0){
                    obstacleGrid[i][j]=obstacleGrid[i][j-1];
                }else if (j==0){
                    obstacleGrid[i][j]=obstacleGrid[i-1][j];
                }else {
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[rows-1][cols-1];
    }
}
