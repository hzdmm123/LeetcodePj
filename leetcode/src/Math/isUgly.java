package Math;

/**
 * Created by hzdmm on 2017/3/8.
 */
public class isUgly {
    public boolean isUgly(int num){
        if (num<=0||num==1){
            return false;
        }

        while (num%2==0) num=num/2;
        if (num==1) return true;

        while (num%3==0) num=num/3;
        if (num==1) return true;

        while (num%5==0) num=num/5;
        if (num==1) return true;

        return false;
    }
}
