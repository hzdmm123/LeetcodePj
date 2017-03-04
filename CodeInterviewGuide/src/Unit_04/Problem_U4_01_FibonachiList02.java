package Unit_04;

/**
 * Created by hzdmm on 2016/10/1.
 */
public class Problem_U4_01_FibonachiList02 {
        public int f2(int n){
            if (n<1){
                return 0;
            }
            if (n==1||n==2){
                return 1;
            }
            int res = 1;
            int pre = 1;
            int temp = 0;
            for (int i=3;i<=n;i++){
                temp = res;
                res = res+pre;
                pre = temp;
            }
            return  res;

        }
        public static void main(String[] args){
            Problem_U4_01_FibonachiList02 ps = new Problem_U4_01_FibonachiList02();
            System.out.println(ps.f2(3));
        }
}
