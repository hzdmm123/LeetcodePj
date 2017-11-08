import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2017/10/30.

 Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

 The order of output does not matter.

 Example 1:

 Input:
 s: "cbaebabacd" p: "abc"

 Output:
 [0, 6]

 Explanation:
 The substring with start index = 0 is "cba", which is an anagram of "abc".
 The substring with start index = 6 is "bac", which is an anagram of "abc".
 Example 2:

 Input:
 s: "abab" p: "ab"

 Output:
 [0, 1, 2]

 Explanation:
 The substring with start index = 0 is "ab", which is an anagram of "ab".
 The substring with start index = 1 is "ba", which is an anagram of "ab".
 The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class findAllAnagramsinaString_438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length()<p.length()||s==null||p==null) return res;
        int m = s.length();
        int n= p.length();
        for (int i=0;i<m+n-1;i++){//因为保证长度，所以不需要遍历到最后
            String cur = s.substring(i,i+n);
            if (helper(cur,p)) res.add(i);
        }
        return res;
    }

    /**
     * 判断两个字符串是否一样（与顺序无关）
     * @param a 字符串
     * @param b 字符串
     * @return true 一样
     */
    public boolean helper(String a,String b){
        if (a==null||b==null||a.length()!=b.length()){
            return false;
        }
        int[] dict = new int[26];
        for (int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            dict[ch-'a']++;
        }

        for (int i=0;i<b.length();i++){
            char ch = b.charAt(i);
            dict[ch-'a']--;
            if (dict[ch-'a']<0) return false;
        }
        return true;
    }
}
