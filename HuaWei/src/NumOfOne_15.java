import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/28.
 */
public class NumOfOne_15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count=0;
        while (num>0){
            if ((num&1)>0){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);
    }
}
