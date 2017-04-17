package DP;

/**
 * Created by hzdmm on 2017/4/16.
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minPri = prices[0];
        for (int i=1;i<prices.length;i++){
            if (prices[i]<minPri){
                max = Math.max(max,prices[i]-minPri);
            }else {
                minPri = prices[i];
            }
        }
        return max;
    }
}
