package mappppppppppp;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by hzdmm on 2017/9/27.
 */
public class sumofTwoNum {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int[] result = new int[2];
        int i=0;
        int j=numbers.length-1;
        while (i<j){
            if (numbers[i]+numbers[j]== target){
                result[0]=i+1;
                result[1]=j+1;
            }
            if (numbers[i]+numbers[j]< target){
                i++;
            }

            if (numbers[i]+numbers[j]> target){
                j--;
            }
        }
        return result;
    }

    public int[] twoSumII(int[] numbers,int target){
        HashMap path = new HashMap<>();
        for (int i=0;i<numbers.length;i++){
            path.put(numbers[i],i);
        }

        int[] result = new int[2];
        for (int i=0;i<numbers.length;i++){
            int temp = target-numbers[i];
            if (path.containsKey(temp)){
                result[1]= (int)path.get(numbers[i])+1;
                result[0]=(int)path.get(temp)+1;
            }
        }
        return result;
    }
}
