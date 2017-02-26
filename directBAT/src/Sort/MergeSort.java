package Sort;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/25.
 */
public class MergeSort {
    public static void mergeSort(int[] num){

        process(num,0,num.length-1);
    }

    public static void process(int[] num, int left, int right) {
        int mid=left+right/2;
        if (left==right){
            return;
        }
        process(num,left,mid);
        process(num,mid+1,right);
        merge(num,left,mid,right);
    }

    public static void merge(int[] num, int left, int mid, int right) {
        int[] help=new int[right-left+1];
        int l = left;
        int r = mid+1;
        int index =0;
        while(l<=mid && r<=right){
            if (num[l]<=num[r]){
                help[index++]=num[l++];
            }else {
                help[index++]=num[r++];
            }
        }
        while (l<=mid)//说明r>right
        {
            help[index++]=num[l++];
        }
        while (r<right){
            help[index++]=num[r++];
        }
        for (int i=0;i<help.length;i++){
            num[left+i]=help[i];
        }
    }

    public static void main(String[] args) {
        int[] num={67,76,44,33,23,87,56,53,55,0};
        mergeSort(num);
        System.out.println(Arrays.toString(num));
    }
}
