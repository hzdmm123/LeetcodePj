import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/31.
 */
public class StatisticStr_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            int en = getEnglishCharCount(str);
            int space = getBlankCharCount(str);
            int math = getNumberCharCount(str);
            int others  = str.length()-en-space-math;
            System.out.println(en);
            System.out.println(space);
            System.out.println(math);
            System.out.println(others);
        }

    }
    /**
     * 统计出英文字母字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getEnglishCharCount(String str)
    {
        int num=0;
        for (int i=0;i<str.length();i++){
            char s = str.charAt(i);
            if ((s>='a'&&s<='z')||(s>='A'&&s<='Z')){
                num++;
            }
        }
        return num;
    }

    /**
     * 统计出空格字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 空格的个数
     */
    public static int getBlankCharCount(String str)
    {
        int num=0;
        for (int i=0;i<str.length();i++){
            char s = str.charAt(i);
            if (s==' '){
                num++;
            }
        }
        return num;
    }

    /**
     * 统计出数字字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getNumberCharCount(String str)
    {
        int num=0;
        for (int i=0;i<str.length();i++){
            char s = str.charAt(i);
            if (s>=0&&s<=9){
                num++;
            }
        }
        return num;
    }
}
