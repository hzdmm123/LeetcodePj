package Alg_ground;

import java.util.Arrays;

/**
 * Created by hzdmm on 2016/9/27.
 */
public class SelectSort {
    public static  void selectSort(int[] num){
        int size = num.length;
        int temp=0;

        for (int i=0;i<size;i++){
            int k =i;

            for (int j=size-1;j>i;j--){
                if (num[j]<num[k]){
                    k = j;
                }
            }
            temp = num[i];
            num[i] = num[k];
            num[k] = temp;
        }

    }
    public static void main(String[] args){
        int[] num={67,76,44,33,23,87,56,53,55,0};
        SelectSort.selectSort(num);
        System.out.println(Arrays.toString(num));

    }


}
