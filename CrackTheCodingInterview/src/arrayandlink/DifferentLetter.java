package arrayandlink;

/**
 * title:判断一个字符串是否都不相同，不允许用其他数据结构 HashmMap
 *
 *使用一个长度128boolean的数组，然后将字符串都强制转换成int型，作为数组的下标并且复制false，当存在一个数组的长度是true
 * 的时候就表示有相同的字符
 * Created by hzdmm on 2017/3/3.
 */
public class DifferentLetter {
    public static void main(String[] args) {
        String s="abcdefg";
        System.out.print(checkAllLetters(s));
    }

    private static boolean checkAllLetters(String s) {
        int n = s.length();
        boolean[] str = new boolean[128];
        for (int i=0;i<n;i++){
            if (str[s.charAt(i)]){
                return false;
            }
            str[s.charAt(i)]=true;
        }
        return true;
    }
}
