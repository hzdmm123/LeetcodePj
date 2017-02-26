package BestTimeToBuyAndSellStock;

/**
 * Created by hzdmm on 2016/12/18.最多交易两次,收益最大
 */
public class Q3_123 {
    public static int maxprofit(int[] prices){
        int sell1 = 0, sell2 = 0, buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }

    public static void main(String[] args) {
        int[] prices={1,2};
        maxprofit(prices);
    }

}
