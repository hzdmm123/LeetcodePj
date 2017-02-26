package sort;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/24.
 */
public class QuickSort {
    public static int  Partition(int[] num,int left,int right){
        int pleft = num[left];
        int pleftkey = left;
        while (left<right){
            while (left<right && num[right]>=pleftkey){
                right--;
            }
            while (left<right && num[left] <=pleftkey){
                left++;
            }
        }
        Util.swap(pleftkey,pleft);
        return left;
    }

    public static void quickSort(int[] num,int left,int right){
        if (left>=right){
            return;
        }
        int temp=Partition(num,left,right);
        quickSort(num,left,temp-1);
        quickSort(num,temp+1,right);

    }

    public static void main(String[] args) {
        int[] num={67,76,44,33,23,87,56,53,55,0};
        QuickSort.quickSort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}
