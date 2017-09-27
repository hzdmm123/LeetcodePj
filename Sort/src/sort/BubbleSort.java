package sort;


import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/24.
 */
public class BubbleSort {
    public static void bubblesort(int[] array){
        if (array==null || array.length<1){
            return;
        }

        for (int i=0;i<array.length;i++){
            for (int j=1;j<array.length-1;j++){
                   if (array[j+1]>array[j]){
                       int t=array[j+1]+array[j];
                       array[j]=t-array[j];
                       array[j+1] = t-array[j];
                   }
            }
        }

    }
    public static void main(String[] args) {
        int[] num={67,76,44,33,23,87,56,53,55,0};
        bubblesort(num);
        System.out.println(Arrays.toString(num));
    }
}

