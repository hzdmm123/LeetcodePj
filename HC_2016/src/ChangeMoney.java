/**
 * Created by hzdmm on 2017/4/1.
 * 有一个数组changes，changes中所有的值都为正数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，对于一个给定值x，请设计一个高效算法，计算组成这个值的方案数。
 给定一个int数组changes，代表所以零钱，同时给定它的大小n，另外给定一个正整数x，请返回组成x的方案数，保证n小于等于100且x小于等于10000。
 测试样例：
 [5,10,25,1],4,15
 返回：6
 测试样例：
 [5,10,25,1],4,0
 返回：1
 */
public class ChangeMoney {
    /**
     * 暴力递归
     * @param changes
     * @param n
     * @param x
     * @return
     */
    public int countWays(int[] changes, int n, int x) {
        return help(changes,0,x);
    }

    private int help(int[] changes, int index, int x) {
        int res = 0;
        if (index==changes.length){
            res = x==0?1:0;//
        }else {
            for (int i=0;changes[index]*i<=x;i++){
                res+=help(changes,index+1,x-changes[index]*i);
            }
        }
        return res;
    }

    /**
     * 记忆化搜索的方法
     * @param changes
     * @param n
     * @param x
     * @return
     */
    public int countWays2(int[] changes, int n, int x) {

        int[][] map = new int[changes.length+1][x+1];
        return help2(changes,0,x,map);
    }

    private int help2(int[] changes, int index, int x,int[][] map) {
        int res = 0;
        if (index==changes.length){
            res = x==0?1:0;
        }else {
            int mapValue=0;
            for (int i=0;changes[index]*i<=x;i++){
                mapValue = map[index+1][x-changes[index]*i];
                if (mapValue!=0){
                    res+=mapValue == -1 ?1:0;
                }else {
                    res+=help2(changes,index+1,x-changes[index]*i,map);
                }

            }
        }
        map[index][x]=res==0?-1:res;
        return res;
    }

    /**
     * 动态规划方法
     */

//    private int countWays3(int[] changes, int aim) {
//        int[][] dp = new int[changes.length][aim+1];
//        for (int i=0;i<changes.length;i++){
//            dp[i][0]=1;
//        }
//
//        for (int i=0;changes[0]*i<=aim;i++){
//            dp[0][changes[0]*i]=1;
//        }
//    }

}
