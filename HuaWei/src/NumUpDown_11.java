import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/28.
 */
public class NumUpDown_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            for (int i=s.length();i>=0;i--){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

}
