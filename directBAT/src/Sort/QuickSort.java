package Sort;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/25.
 */
public class QuickSort {
    public static void QuickSort(int[] num){
        if (num==null||num.length<2){
            return;
        }

        process(num,0,num.length-1);


    }

    public static void process(int[] num,int left,int right){
        if (left<right) {
            int random = left + (int) (Math.random() * (right - left + 1));
            swap(num, random, right);
            int mid = partition(num, left, right);
            process(num, left, mid - 1);
            process(num, mid + 1, right);
        }

    }

    public static int partition(int[] num,int left,int right){
        int pivot=left-1;
        int index = left;
        while (index<=right){
            if (num[index]<=num[right]){
                swap(num,++pivot,index);
            }
            index++;
        }
        return pivot;
    }

    public static int[] generateArray(int len,int range){
        if (len<1){
            return null;
        }
        int[] num = new int[len];
        for (int i=0;i<len;i++){
            num[i]=(int)(Math.random()*range);
        }
        return num;
    }

    public static void printArray(int[] num){
        if (num==null||num.length<1){
            return;
        }
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

    }

    public static boolean isSorted(int[] num){
        if (num==null||num.length<2){
            return true;
        }
        for (int i=1;i<num.length;i++){
            if (num[i-1]>num[i]){
                return false;
            }
        }
        return true;

    }
    public static void swap(int[] num,int index1,int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;

    }
    public static void main(String[] args) {
        int len = 10;
        int range = 10;
        int testTimes = 50000;
        for (int i=0;i<testTimes;i++){
            int[]  num = generateArray(len,range);
            QuickSort(num);
            System.out.println(Arrays.toString(num));
            if (!isSorted(num)){
                System.out.println("wrong case");
                printArray(num);
                break;
            }
        }

    }
}
