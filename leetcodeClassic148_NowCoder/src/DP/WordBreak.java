package DP;

import java.util.Set;

/**
 * Created by hzdmm on 2017/8/25.
 * Given a string s and a dictionary of words dict,
 * determine
 * if s can be segmented into a space-separated sequence of one or more dictionary words.
 For example, given
 s ="leetcode",
 dict =["leet", "code"].
 Return true because"leetcode"can be segmented as"leet code".
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] dp = new boolean[s.length()];
        for (int i=0;i<s.length();i++){
            if (dict.contains(s.substring(0,i+1))){
                dp[i]=true;
                continue;
            }
            for (int j=0;j<i;j++){
                if (dp[j]&&dict.contains(s.substring(j+1,i+1))){
                    dp[i]=true;
                }
            }
        }
        return dp[s.length()-1];
    }

    public boolean wordBreak2(String s,Set<String> dict){
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i=0;i<s.length();i++){
            for (int j=0;j<i;j++){
                if (dp[j]&&dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        return dp[s.length()];

    }
}
