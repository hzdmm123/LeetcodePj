package DP;

/**
 * Created by hzdmm on 2017/4/18.
 */
public class IsSubSequence_392 {
    public boolean isSubsequence(String s, String t) {
        char[] s1= s.toCharArray();
        char[] t2 =s.toCharArray();
        int i =0;
        int j =0;
        while (j<t2.length&&i<s1.length){
            if (s1[i]==t2[j]){
                i++;
                if (i==s1.length){
                    return true;
                }

            }
            j++;
        }
        return false;
    }
}
