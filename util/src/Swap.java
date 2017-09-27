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
    static int[] arr = new int[5];
    public static void main(String[] args) {
        int[] brr = new int[5];
        System.out.println(arr[0]);
        System.out.println(brr[0]);

    }
}
