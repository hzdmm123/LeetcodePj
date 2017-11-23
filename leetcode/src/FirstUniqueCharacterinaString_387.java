import java.util.HashMap;

/**
 * Created by hzdmm on 2017/11/21.
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 */
public class FirstUniqueCharacterinaString_387 {
    public static int firstUniqChar(String s) {
        int[] res = new int[26];
        for (int i=0;i<s.length();i++){
            res[s.charAt(i)-'a']++;
        }

        for (int i =0;i<s.length();i++){
            if (res[s.charAt(i)-'a']==1){//为什么是一想想清楚  题意理解错了，太伤了。
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("hello"));
    }
}
