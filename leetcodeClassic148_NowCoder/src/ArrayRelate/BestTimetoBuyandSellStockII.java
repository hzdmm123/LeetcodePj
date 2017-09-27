package ArrayRelate;

/**
 * Created by hzdmm on 2017/9/22.
 * 假设有一个数组，它的第i个元素是一个给定的股票在第i天的价格。
 * 设计一个算法来找到最大的利润。你可以完成尽可能多的交易(多次买卖股票)。
 * 然而,你不能同时参与多个交易(你必须在再次购买前出售股票)。
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length==0||prices==null){
            return 0;
        }
        int res = 0;
        for (int i=1;i<prices.length;i++){
            if (prices[i]-prices[i-1]>0){
                res +=prices[i]-prices[i-1];
            }
        }
        return res;
    }
}
