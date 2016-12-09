package Array; /**
 * Created by hzdmm  2016/10/21.
 */
import java.util.*;
public class TwoSum2InputArrayisSorted167 {
    public static int[] twoSum(int[] numbers,int target){
        int i=0;
        int maxsize=numbers.length-1;
        int twosum[] = new int[2];
        while(numbers[maxsize]>target){
            maxsize--;//去除数组中比target还大的数据
        }
        while (i<maxsize){
            if (numbers[i]+numbers[maxsize]<target){
                i++;
            }else if (numbers[i]+numbers[maxsize]>target){
                maxsize--;
            }else{
                    break;

            }

        }
        twosum[0]=i;
        twosum[1]=maxsize;

        return twosum;
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        twoSum(numbers,6);
    }
}
//not discussed
/*public int[] twoSum(int[] numbers, int target) {
    for (int i = 0, n = numbers.length; i < n - 1; i++) {
        int j = Arrays.binarySearch(numbers, i + 1, n, target - numbers[i]);
        if (j > 0) return new int[]{i + 1, j + 1};
    }
    return null;
}*/
