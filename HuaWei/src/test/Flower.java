package test;

/**
 * Created by hzdmm on 2017/4/7.
 */
public class Flower{
    public static void main(String[] args) {
        int count=1;
        int sum=0;
        int a;
        int b;
        int c;
        for (int i=100;i<=999;i++){
            a = i/100;
            b = i%100/10;
            c = i%10;
            if (i==a*a*a+b*b*b+c*c*c){
                System.out.println("第"+count+"个水仙花数: "+i);
                sum+=i;
                count++;
            }
        }
        System.out.print("水仙花数总和为: "+sum);
    }

}
