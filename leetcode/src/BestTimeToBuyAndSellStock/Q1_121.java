package BestTimeToBuyAndSellStock;

/**
 * Created by hzdmm on 2016/12/18.只能做一次交易.
 */
public class Q1_121 {
    public static int maxProfit(int[] prices){
        if (prices.length==0){
            return 0;
        }

        int max=0;
        int mincur=prices[0];
        for (int i=1;i<prices.length;i++){
            if (prices[i]>mincur){
                max=Math.max(max,prices[i]-mincur);
            }else{
                mincur=prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices={4,7,1,5};
        System.out.println(maxProfit(prices));

    }
}

