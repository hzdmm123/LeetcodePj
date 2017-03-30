import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 */
public class TranverStr_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            char[] q= sc.next().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i=q.length-1;i>=0;i--){
                sb.append(q[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
