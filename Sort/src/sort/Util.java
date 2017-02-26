package sort;

/**
 * Created by hzdmm on 2017/2/24.
 */
public class Util {
    public static Boolean checkisNN(int[] array) {
        if (array.length==0 || array==null){
            return false;
        }
        return true;
    }

    public static void swap(int a,int b){
        a =a+b;
        b = a-b;
        a = a -b;
    }
}
