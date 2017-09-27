package bitopereation;

/**
 * Created by hzdmm on 2017/9/26.
 * 如果要将整数A转换为B，需要改变多少个bit位？
 * 思路:先做与非,然后找多二进制中有多少个1
 */
public class swapAToB {
    public int bitSwapRequired(int a, int b) {
        int c = a^b;
        int res=0;
        for (int i=1;i<=32;i++){
            res+=(c>>i)&1;
        }
        return res;
    }
}
