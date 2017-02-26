import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2017/2/10.
 */
public class CombinationSum3_216 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        combination(res,new ArrayList<Integer>(),k,1,n);
        return  res;
    }

    private static void combination(List<List<Integer>> res, ArrayList<Integer> comb, int k, int start, int n) {
        if (comb.size()==k && n==0){
            List<Integer> li = new ArrayList<Integer>(comb);
            res.add(li);//获得拷贝深度遍历的结果,comb作为一个工兵是不断去尝试。
            return;
        }

        for (int i=start;i<=9;i++){
            comb.add(i);
            combination(res,comb,k,i+1,n-i);//用深度遍历去理解
            comb.remove(comb.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }

}
