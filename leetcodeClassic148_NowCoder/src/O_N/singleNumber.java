package O_N;

/**Given an array of integers,
 * every element appears twice except for one.
 * Find that single one.
 * Created by hzdmm on 2017/8/31.
 */
public class singleNumber {

    public static int singleNumber(int[] A) {
        int res=0;
        for (int i=0;i<A.length;i++){
            res^=A[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1,1,2,2,3};
        System.out.println(singleNumber(A));
    }
}
