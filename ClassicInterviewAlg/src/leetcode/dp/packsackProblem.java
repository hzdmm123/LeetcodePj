package leetcode.dp;

/**
 * Created by hzdmm on 2017/8/3.
 */
public class packsackProblem {
    int[] w= new int[10];
    int[] v = new int[10];
    int con = 5;
    int[][] f= new int[10][5];
    //暴力递归
    public int search1(int idx,int S){
        if(S>con){
            return 0;
        }
        return Math.max(search1(idx+1,w[idx]+S)+v[idx],search1(idx+1,S));
    }
    //记忆化搜索

    public int search2(int idx,int S){
        if (S>con){
            return 0;
        }
        if (f[idx][S]>=0){
            return f[idx][S];
        }
        f[idx][S] = Math.max(search2(idx+1,w[idx])+v[idx],search2(idx+1,S));
        return f[idx][S];
    }

}
