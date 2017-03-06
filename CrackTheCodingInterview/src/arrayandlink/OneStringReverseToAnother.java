package arrayandlink;

import java.util.Arrays;

/** title:给定两个字符串，确定其中一个字符串的字符重新排序后，能否变成另一个字符串，
 * 主要判定两个字符里面的的字符是否都一样（包括重复）
 * Created by hzdmm on 2017/3/6.
 */
public class OneStringReverseToAnother {
    public static String sort(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

    public static boolean isOrderOk(String a,String b){
        if (a.length()!=b.length()){
            return false;
        }
        return sort(a).equals(sort(b));
    }

    public static void main(String[] args) {
        System.out.println(isOrderOk("abcde","abced"));
    }

    /**
     * 利用一个数组记录a字符串的出现的次数然后把b字符按个检查，只要有一个字符的数组的值小鱼0，就是false
     * @param a
     * @param b
     * @return
     */
    public static boolean isOrderOk2(String a,String b){
        if (a.length()!=b.length()){
            return false;
        }

        int[] letters = new int[256];
        char[] s_toArray= a.toCharArray();
        for (char c : s_toArray){
            letters[c]++;
        }

        for (int i=0;i<b.length();i++){
            int c = (int)b.charAt(i);
            if (--letters[c]<0){
                return false;
            }
        }
        return true;
    }


}
