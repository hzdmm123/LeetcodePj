package sort;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/24.
 */
public class InsertSort {
    public static void insertSort(int[] array){
        if (array==null || array.length<1){
            return;
        }
        for (int i=1;i<array.length;i++){
            int j=i-1;
            int target = array[i];
            while (target<=array[j] && j >0 ){//本体注意的是边界问题，需要处理好了
                array[j+1]=array[j];
                j--;
            }
            array[j] = target;
        }
    }

    public static void main(String[] args) {
        int[] num={67,76,44,33,23,87,56,53,55,0};
        InsertSort.insertSort(num);
        System.out.println(Arrays.toString(num));
    }
}
