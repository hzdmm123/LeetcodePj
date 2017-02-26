/**
 * Created by hzdmm on 2016/10/1.
 */
public class Problem_U4_01_FibonachiList01 {
    public int fi(int n){
        if (n<0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return fi(n-1)+fi(n-2);
    }
    public static void main(String[] args){
        Problem_U4_01_FibonachiList01 pf = new Problem_U4_01_FibonachiList01();
        System.out.print(pf.fi(47));
    }

}
