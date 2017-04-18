import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/31.
 */
public class BallJump_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double high = sc.nextDouble();
            System.out.println(getJourney(high));
            System.out.println(getTenthHigh(high));
        }
    }
    /**
     * 统计出第5次落地时，共经过多少米?
     *
     * @param high 球的起始高度
     * @return 英文字母的个数
     */
    public static double getJourney(double high)
    {   int count=1;
        double sum = high;
        while (count<5){
            high = high*1.0/2;
            sum +=2*high;
            count++;
        }
        return sum;
    }
    /**
     * 统计出第5次反弹多高?
     *
     * @param high 球的起始高度
     * @return 空格的个数
     */
    public static double getTenthHigh(double high)
    {
        int count=1;
        while (count<5){
            high = high*1.0/2;
            count++;
        }
        return high;
    }

}
