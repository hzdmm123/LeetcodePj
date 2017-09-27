package ArrayRelate;

/**
 * Created by hzdmm on 2017/9/22.
 * 假设你有一个数组，它的第i个元素是一支给定的股票在第i天的价格。
 * 设计一个算法来找到最大的利润。你最多可以完成两笔交易。
 * 思想:二分  每一个i作为一个分界点   存储最大的利润
 */
public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        // write your code here
        if (prices.length==0||prices==null){
            return 0;
        }
        int length = prices.length;
        int[] first = new int[length];
        int[] second = new int[length];

        int min = prices[0];
        for (int i=1;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            first[i]=Math.max(first[i-1],prices[i]-min);//从前往后计算出当前i的最大利润0-i的利润
        }

        int max = prices[length-1];
        for (int i = length-2;i>=0;i--){
            max = Math.max(max,prices[i]);
            second[i]=Math.max(second[i+1],max-prices[i]);//从后往前计算当前i的最大利润i-length的利润
        }

        int maxprofit = 0;
        for (int i=0;i<length;i++){
            maxprofit=Math.max(maxprofit,first[i]+second[i]);
        }

        return maxprofit;
    }
}
