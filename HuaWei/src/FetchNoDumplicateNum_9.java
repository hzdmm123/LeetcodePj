import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * Created by hzdmm on 2017/3/27.
 * 题目描述
 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。

 输入描述:
 输入一个int型整数


 输出描述:
 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

 输入例子:
 9876673

 输出例子:
 37689
 */
public class FetchNoDumplicateNum_9 {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        HashMap map = new HashMap();
        while (sc.hasNext()){
            stack.push(sc.nextInt());
        }
        for (int i=0;i<stack.size();i++){
            if (map.get(i)==null){
                map.put(i,stack.pop());
            }
        }
        String res="";
        for (int i=map.size();i<=0;i--){
            res+=map.get(i);
        }

        System.out.println(Integer.parseInt(res));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] nums = str.toCharArray();
            Set<Character>  set = new LinkedHashSet<>();
            for (int i=nums.length;i>=0;i--){
                set.add(nums[i]);
            }

            String res = "";
            for (Character c : set){
                res +=c+" ";
            }
            System.out.println(res);
        }
    }
}
