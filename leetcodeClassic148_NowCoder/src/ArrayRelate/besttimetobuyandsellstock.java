package ArrayRelate;

/**
 * Created by hzdmm on 2017/9/22.
 * Say you have an array for which the i th element is the price of a given stock on day i.
 If you were only permitted to complete at most one transaction
 (ie, buy one and sell one share of the stock),
 design an algorithm to find the maximum profit.
 */
public class besttimetobuyandsellstock {
    public int maxProfit(int[] prices) {
        if (prices.length==0||prices==null){
            return 0;
        }
        int result=0;
        int min=prices[0];
        for (int i=1;i<prices.length;i++){
          if (prices[i]>min){
              result=Math.max(result,prices[i]-min);
          }else {
              min= prices[i];
          }

        }
        return result;
    }

    public int maxProfitII(int[] prices){
        if (prices.length==0||prices==null){
            return 0;
        }

        int local = 0;
        int global = 0;
        for (int i=1;i<prices.length;i++){
            local=Math.max(0,local+prices[i]-prices[i-1]);//局部最大值
            global= Math.max(global,local);//全局最大值
        }
        return global;
    }
}
