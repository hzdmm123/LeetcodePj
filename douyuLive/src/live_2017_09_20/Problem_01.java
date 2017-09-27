package live_2017_09_20;

/**
 * Created by hzdmm on 2017/9/19.
 */
public class Problem_01 {
    public static int  Solution(int num){
        int res=0;
        for (int i=1;;i++){
            while (((i*(i-1)/2)<res&&res<(i*(i+1)/2))){
                return i;
            }
            continue;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution(10));
    }
}
