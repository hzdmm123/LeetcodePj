import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/28.
 */
public class TranverseSeq_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
        String s = sc.nextLine();
            System.out.println(reverse(s));
        }
    }


    public static String reverse(String sentence){
        String[] tmp = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=tmp.length-1;i>=0;i--){
            if (i==0){
                sb.append(tmp[i]);
                break;
            }
            sb.append(tmp[i]+" ");
        }
        return sb.toString();
    }
}
