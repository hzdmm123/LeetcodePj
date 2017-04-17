package DFS;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hzdmm on 2017/4/10.
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.

 Example 1:

 11110
 11010
 11000
 00000
 Answer: 1

 Example 2:

 11000
 11000
 00100
 00011
 Answer: 3
 */
public class NumberofIslands_200 {
    public int numIslands(char[][] grid) {
        if (grid==null) return -1;
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]=='1'){
                    count++;
                    DFSMarKing(grid,i,j);
                }
            }
        }
        return count;
    }

    private void DFSMarKing(char[][] grid, int i, int j) {
        if (i<0||i>grid.length||j<0||j>grid[0].length||grid[i][j]!=1) return;
        grid[i][j]='0';
        DFSMarKing(grid,i-1,j);
        DFSMarKing(grid,i+1,j);
        DFSMarKing(grid,i,j-1);
        DFSMarKing(grid,i,j+1);
    }
}
