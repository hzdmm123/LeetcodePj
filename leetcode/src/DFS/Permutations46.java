package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2017/2/16.标准框架.(*****)
 */
public class Permutations46 {
    public static  List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public static int[] path = new int[100];//存暂时答案
    public static boolean v[] = new boolean[100];//是否使用过

    public void robot(int idx,int[] nums){
        if(idx>=nums.length){//边界条件
            //record ans
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[path[i]]);
            }
            ans.add(temp);
            return;
        }

        for(int i= 0;i<nums.length;i++){
            if(v[i]==false)
            {
                path[idx] =i;//
                v[i]=true;
                robot(idx+1,nums);
                v[i]=false;//调整回来

            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ans.clear();
        robot(0,nums);
        return ans;

    }
}
