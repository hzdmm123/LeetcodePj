package hash;

import java.util.HashMap;

/**
 * Created by hzdmm on 2017/9/21.
 */
public class TwoNum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i=0;i<numbers.length;i++){
            hashMap.put(numbers[i],i);
        }
        for (int i=0;i<numbers.length;i++){
            int tempTar = target-numbers[i];
            if (hashMap.containsKey(tempTar)){
                return new int[]{i+1,hashMap.get(tempTar)+1};
            }
        }

        return null;
    }
}
