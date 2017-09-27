package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by hzdmm on 2017/8/28.
 * Given a string s and a dictionary of words dict,
 * add spaces in s to construct a sentence
 * where each word is a valid dictionary word.
 Return all such possible sentences.
 For example, given
 s ="catsanddog",
 dict =["cat", "cats", "and", "sand", "dog"].
 A solution is["cats and dog", "cat sand dog"].
 */
public class WordBreak_II {
    ArrayList<String> result = new ArrayList<>();

    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        if (brack(s,dict)){
            dfs(s,dict,"");
        }
        return result;
    }

    private void dfs(String subString, Set<String> dict, String currentString) {
        if (subString.length()==0){
            result.add(currentString);
        }

        for (int i=0;i<subString.length();i++){
            String sub = subString.substring(0,i);
            if (dict.contains(sub)){
                int sublen= currentString.length();

                if (!currentString.equals("")){
                    currentString +=" ";
                }

                currentString +=sub;

                dfs(subString.substring(i),dict,currentString);

                currentString = currentString.substring(0,sublen);
            }
        }
    }

    public boolean brack(String s,Set<String> dict){
        int n=s.length();
        boolean dp[] = new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<n+1;i++){
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<i;j++){
                if (dp[j]&&dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    sb.append(s.substring(j,i));
                    break;
                }
            }
        }

        return dp[n];
    }

    public ArrayList<String> wordBreak_II(String s,Set<String> dict){
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> path = new ArrayList<>();
         dfs_II(s,dict,path,res,0);
         return res;
    }

    private void dfs_II(String s, Set<String> dict, List<String> path, List<String> res, int index) {
        int lenth = s.length();
        if (index==lenth){
            StringBuilder sb = new StringBuilder();
            for (String str: path){
                sb.append(str);
                sb.append(" ");
            }

            sb.deleteCharAt(sb.length()-1);
            res.add(sb.toString());
            return;
        }

        if (!canBreak(s.substring(index),dict)){
            return;
        }

        for (int i=index;i<lenth;i++){
            String left = s.substring(index,i+1);
            if (!dict.contains(left)){
                continue;
            }

            path.add(left);
            dfs_II(s,dict,path,res,i+1);
            path.remove(path.size()-1);
        }
    }

    private boolean canBreak(String substring, Set<String> dict) {
        int n = substring.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i=1;i<n+1;i++){
            for (int j=0;j<i;j++){
                if (dp[j]&&dict.contains(substring.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int a=10;
        a=a>>1;
        System.out.println(a);
    }


}
