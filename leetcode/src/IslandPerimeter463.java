/**
 * Created by hzdmm on 2016/12/10.
 */
public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        int m =grid.length;
        int n =grid[0].length;
        if (m==0||n==0){
            return 0;
        }
        int preimeter = 0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (grid[i][j]==1){
                    preimeter+=4;
                    if (i>0&& grid[i-1][j]==1) preimeter-=2;
                    if (j>0&& grid[i][j-1]==1) preimeter-=2;

                }

            }
        }
        return preimeter;
    }
}
