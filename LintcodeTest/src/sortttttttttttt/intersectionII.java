package sortttttttttttt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by hzdmm on 2017/9/25.
 */
public class intersectionII {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> recoder = new HashMap();//使用hashMap的性质来解决
        ArrayList<Integer> res = new ArrayList<>();//list缓存结果集
        for (int i=0;i<nums1.length;i++){
            recoder.put(nums1[i],recoder.get(nums1[i])==null?1:recoder.get(nums1[i])+1);
            //value的值可能取到的是null,所以给他一个判断,然后value表示出现的次数
        }

        for (int i=0;i<nums2.length;i++){
            if (recoder.get(nums2[i])!=null&&recoder.get(nums2[i])>0){
                res.add(nums2[i]);//加入到结果集中
                recoder.put(nums2[i],recoder.get(nums2[i])-1);//加入到结果集中,记录集的个数需要减去1
            }
        }
        int[] result = new int[res.size()];
        Iterator iterator = res.iterator();
        int i=0;
        while (iterator.hasNext()){
            result[i++]=(int)iterator.next();
        }
        return result;
    }
}
