package arrayandlink;

/**
 * title:判断一个字符串是否都不相同，不允许用其他数据结构
 * Created by hzdmm on 2017/3/3.
 */
public class DifferentLetter {
    public static void main(String[] args) {
        String s="adhjjcasjfd";
        System.out.print(checkAllLetters(s));
    }

    private static boolean checkAllLetters(String s) {
        char[] array = s.toCharArray();
        return false;
    }
}
