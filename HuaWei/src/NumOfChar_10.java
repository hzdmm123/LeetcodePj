import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 */
public class NumOfChar_10 {
    public static void main(String[] args) {
        boolean[] res = new boolean[128];
        for (int i=0;i<res.length;i++){
            res[i]=false;
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            for (int i=0;i<s.length();i++){
            if (res[s.charAt(i)]==false){
                res[s.charAt(i)]=true;
            };
            }
        }
        int count=0;
        for (int i=0;i<res.length;i++){
            if (res[i]==true){
                count++;
            }
        }
        System.out.println(count);
    }
}
