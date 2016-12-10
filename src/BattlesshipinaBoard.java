/**
 * Created by hzdmm on 2016/12/10.
 */
public class BattlesshipinaBoard {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        if (m==0){
            return 0;
        }
        int count=0;

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (board[i][j] == '.') continue;
                if (i > 0 && board[i-1][j] == 'X') continue;
                if (j > 0 && board[i][j-1] == 'X') continue;
                count++;                }
            }
        return count;
    }
}
