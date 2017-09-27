package bitopereation;

/**
 * Created by hzdmm on 2017/9/26.
 * 计算在一个 32 位的整数的二进制表示中有多少个 1.
 */
public class numberoflbinary {
    public static int countOnes(int num) {
        int res=0;
        for (int i=1;i<=32;i++){
            res+=(num>>i)&1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countOnes(32));
    }
}
