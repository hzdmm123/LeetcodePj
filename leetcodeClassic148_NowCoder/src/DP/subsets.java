package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by hzdmm on 2017/8/29.
 * Given a set of distinct integers, S, return all possible subsets.
 Note:
 Elements in a subset must be in non-descending order.
 The solution set must not contain duplicate subsets.

 For example,
 If S =[1,2,3], a solution is:
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */
public class subsets {
    public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        Arrays.sort(S);
        return help(S,path,res,0);
    }

    private static ArrayList<ArrayList<Integer>>  help(int[] s, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res, int index) {
        if (index==s.length){
            ArrayList<Integer> cur = new ArrayList<>(path);
            res.add(cur);
            return null;
        }

        path.add(s[index]);
        help(s,path,res,index+1);
        path.remove(path.size()-1);
        help(s,path,res,index+1);

        return res;
    }

    public static void main(String[] args) {
        int[] res = {1,};
        ArrayList<ArrayList<Integer>> ress = subsets(res);
    }
}
