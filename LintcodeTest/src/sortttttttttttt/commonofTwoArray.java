package sortttttttttttt;

import java.util.*;

/**
 * Created by hzdmm on 2017/9/25.
 */
public class commonofTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        if (nums1==null||nums2==null||nums1.length==0||nums2.length==0){
            return new int[]{};
        }
        HashSet<Integer> results= new HashSet<Integer>() ;
        HashMap<Integer,Boolean> res= new HashMap();//true代表有值
        for (int i=0;i<nums1.length;i++){
            res.put(nums1[i],true);
        }
        for (int i=0;i<nums2.length;i++){
            if (res.get(nums2[i])!=null&&res.get(nums2[i])==true){//null判断必须
                if (!results.contains(nums2[i]))
                {
                    results.add(nums2[i]);
                }
            }
        }
        int[] ress = new int[results.size()];
        int i=0;
        Iterator iterator = results.iterator();
        while (iterator.hasNext()){
            ress[i++]=(int)iterator.next();
        }
        return ress;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,7,9,7,6,7};
        int[] nums2 = new int[]{5,0,0,6,1,6,2,2,4};
        System.out.println(intersection(nums1,nums2));
    }
}
