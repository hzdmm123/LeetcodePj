package Sort;

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
        b=a-b;
        a=a-b;
    }

    public static void main(String[] args) {
        int a=1,b=2;
        swap(a,b);
        System.out.print("bianle"+a+b);
    }
}
