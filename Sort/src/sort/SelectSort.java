package sort;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/24.
 */
public class SelectSort {
    public static void selectsort(int[] array){
        if (array.length<1 || array == null){
            return;
        }

        for (int i=0;i<array.length;i++){
            int index = i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]>array[index]){
                    index = j;//找到之后比它大的，最后交换位置,与冒泡的区别是冒泡时刻准备替换
                }
            }
            if (index!=i){
                int temp = array[index];
                array[i] = temp;
                array[index] = array[i];
            }

        }

    }

    public static void main(String[] args) {
        int[] num={67,76,44,33,23,87,56,53,55,0};
        SelectSort.selectsort(num);
        System.out.println(Arrays.toString(num));
    }
}
