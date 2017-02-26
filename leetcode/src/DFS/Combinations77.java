package DFS;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2017/2/16.
 */
public class Combinations77 {
    public static List<List<Integer>> ans = new ArrayList<>();
    public static int[] path = new int[100];
    public static  int K=0;
    public void robot(int idx,int n,int k){//idx [0,)
        if (k==0){//record ans
            List temp = new ArrayList();
            for (int i=0;i<K;i++){//用来保存
                temp.add(path[i]);
            }
            ans.add(temp);
            return;
        }
        for (int i=idx+1;i<=n;i++){//避免有重复的东西
            path[k-1] = i;
            robot(i,n,k-1);

        }

    }
    public List<List<Integer>> combine(int n, int k) {
        ans.clear();
        K=k;
        robot(0,n,k);

        return ans;
    }
}
