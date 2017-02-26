package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2017/2/17.
 */
public class Subset2_90 {
    public static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static boolean[] v = new boolean[100];

    public void robot(int idx,int[] nums){
        if(idx>=nums.length){
            List<Integer> temp = new ArrayList<Integer>();
            for (int i=0;i<nums.length;i++){
                if (v[i]){
                    temp.add(nums[i]);

                }
                ans.add(temp);
                return ;
            }


        }
        if (idx >0&&nums[idx-1]==nums[idx]&&v[idx-1]==false){
            v[idx]=false;
            robot(idx+1,nums);
        }else {
            v[idx] = true;
            robot(idx+1,nums);
            v[idx] = false;
            robot(idx+1,nums);
        }


    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.clear();
        robot(0,nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;i++){
                if(nums[i]>nums[j]){
                    int t = nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        return ans;
    }
}
