package arraysandmatrices;

/**
 * Created by hzdmm on 2017/9/26.
 * 给一个01矩阵，求不同的岛屿的个数。

 0代表海，1代表岛，如果两个1相邻，那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
 [
 [1, 1, 0, 0, 0],
 [0, 1, 0, 0, 1],
 [0, 0, 0, 1, 1],
 [0, 0, 0, 0, 0],
 [0, 0, 0, 0, 1]
 ]
 */
public class numIslands {
    public static int numIslands(boolean[][] grid) {
        if (grid==null||grid.length==0||grid[0].length==0){
            return 0;
        }
        int res = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (grid[i][j]){
                    res++;
                    dfsSearch(grid,i,j,col,row);
                }
            }
        }
        return res;
    }

    private static void dfsSearch(boolean[][] grid, int i, int j, int col, int row) {
        if (i<0||j>=col||i>=row||j<0){
            return;
        }

        if (!grid[i][j]){
            return;
        }
        dfsSearch(grid, i + 1, j, col, row);
        dfsSearch(grid, i - 1, j, col, row);
        dfsSearch(grid, i, j + 1, col, row);
        dfsSearch(grid, i, j - 1, col, row);
    }

}
