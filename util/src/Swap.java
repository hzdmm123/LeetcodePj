/**
 * Created by hzdmm on 2017/2/24.
 */
public class Swap {
    public static void swap(int a,int b){
        if (a>b){
            a=a+b;
            b=a-b;
            a=a-b;
        }
    }
}
