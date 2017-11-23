package stringGGGG;

/**
 * Created by hzdmm on 2017/11/21.
 * Description : Implement strStr().

 Return the index of the first occurrence of needle in haystack,
 or -1 if needle is not part of haystack.

 Example 1:

 Input: haystack = "hello", needle = "ll"
 Output: 2
 Example 2:

 Input: haystack = "aaaaa", needle = "bba"
 Output: -1

 */
public class ImplementOfstrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.length()>haystack.length()){
            return -1;
        }
        int begin = 0;
        int cur;
        for (int i = 0;i<haystack.length()-needle.length();i++){
            begin=i;
            cur = 0;
            for (int j = 0;j<needle.length();j++){
                if (haystack.charAt(begin)==needle.charAt(j)){
                    begin++;
                    cur++;
                    if (cur==needle.length()){
                        return i;
                    }
                }

            }
        }
        return -1;
    }

    public static int strStr_2(String haystack,String needle){
/*        for (int i=0;;i++){
            for (int j=0;;j++){
                if (j==needle.length()) return i;
                if ( i+ j == haystack.length()) return -1;
                if (needle.charAt(j)!=haystack.charAt(i+j)) break;
            }
        }*/
        if (haystack.length()<needle.length()){
            return -1;
        }

        if (needle.length()==0){
            return 0;
        }

        int thread = haystack.length()-needle.length();
        for (int i=0;i<thread;i++){
            if (haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String hayStack = "hello";
        String needle = "ll";
        System.out.println(strStr(hayStack,needle));
    }
}
