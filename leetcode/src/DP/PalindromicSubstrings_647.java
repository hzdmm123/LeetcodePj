package DP;

/**
 * Created by hzdmm on 2017/9/4.
 * Given a string, your task is to count how many palindromic substrings in this string.
 The substrings with different start indexes or end indexes are
 counted as different substrings even they consist of same characters.
 Input: "abc"
 Output: 3
 Explanation: Three palindromic strings: "a", "b", "c".
 Example 2:
 Input: "aaa"
 Output: 6
 Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */
public class PalindromicSubstrings_647 {
    int ans=0;
    public int countSubstrings(String s) {
        if (s.length()==0||s==null){
            return 0;
        }
        char[] ss = s.toCharArray();
        for (int i=0;i<ss.length;i++){
            solve(ss,i,i);//奇数个数
            solve(ss,i,i+1);//偶数个数

        }
        return ans;
    }

    private void solve(char[] ss, int start, int end) {
        while (start>=0&&end<ss.length&&ss[start]==ss[end]){
            ans++;
            start--;
            end++;
        }
    }

    public int countSubStrings_II(String s){
        int res = 0, n = s.length();
        char[] ss = s.toCharArray();
        for(int i = 0; i<n ;i++ ){
            // i or (i-1, i) is the middle index of the substring, 2*j + 1 or 2*j + 2 is the length of the substring
            for(int j = 0; i-j >=0 && i+j <n && ss[i-j] == ss[i+j]; j++)res++;
            for(int j = 0; i-1-j >=0 && i+j <n && ss[i-1-j] == ss[i+j];j++)res++;
        }
        return res;
    }
}
