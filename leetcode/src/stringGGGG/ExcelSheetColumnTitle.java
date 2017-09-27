package stringGGGG;

/**
 * Created by hzdmm on 2017/9/5.
 */
public class ExcelSheetColumnTitle {
    public static String column(int n){
        String res="";
        while (n!=0){
            res=(char)((n-1)%26+'A')+res;
            n=(n-1)/26;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(column(28));
    }
}
