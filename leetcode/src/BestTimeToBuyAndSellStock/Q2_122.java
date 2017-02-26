package BestTimeToBuyAndSellStock;

/**
 * Created by hzdmm on 2016/12/18.//把顺序增长的都加上就好了
 */
public class Q2_122 {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] > prices[i]) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }

}
