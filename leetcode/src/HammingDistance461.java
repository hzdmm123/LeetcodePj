/**
 * Created by hzdmm on 2017/2/8.
 */
public class HammingDistance461 {
    public static int HammingDistance461(int x, int y) {
        int res=0;
        int result=0;
        res = x ^ y;

        for (int i=0;i<32;i++){
            result+=(res>>i)&1;
        }
        return result;
    }

    public static void main(String[] args) {
        int res=HammingDistance461(3,4);
        System.out.println(res);
    }
}
