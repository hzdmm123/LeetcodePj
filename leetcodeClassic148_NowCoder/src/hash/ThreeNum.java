package hash;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hzdmm on 2017/9/22.
 * Given an array S of n integers, are there elements a, b, c i
 * n S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 */
public class ThreeNum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {

        if (num==null||num.length==0){
            return null;
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        int target = 0;
        for (int i=0;i<num.length-2;i++){
            if (i==0||(i>0&&num[i]!=num[i-1])){
                int low=i+1;
                int high = num.length-1;
                int sum = target-num[i];
                while (low<high){
                    if (num[low]+num[high]==sum){
                        ArrayList<Integer> add = new ArrayList<>();
                        add.add(num[i]);
                        add.add(num[low]);
                        add.add(num[high]);
                        res.add(add);
                        while (low<high&&num[low]==num[low+1]){
                            low++;
                        }

                        while (low<high&&num[high]==num[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    }else if (num[low]+num[high]<sum){
                        low++;
                    }else {
                        high--;
                    }
                }
            }
        }
        return res;



    }
}
