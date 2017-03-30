import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 */
public class factor_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long num = in.nextLong();
            String str = getResult(num);
            System.out.println(str);
            }
        }

    private static String getResult(long num) {
        StringBuilder sb = new StringBuilder();
        while (num!=1){
            for (int i=2;i<=num;i++){
                if (num%i==0){
                    num = num/i;
                    sb.append(i).append(" ");
                    break;
                }
            }
        }
        return sb.toString();
    }

}
