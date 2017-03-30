import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 */
public class Transfer_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.next().substring(2);
            System.out.println(Integer.parseInt(str,16));
        }
    }
}
