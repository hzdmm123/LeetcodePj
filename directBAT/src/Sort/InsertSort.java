package Sort;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/25.
 */
public class InsertSort {
    public static void InsertSort(int[] num){
        if (num.length<2 || num==null){
            return;
        }

        for (int i=1;i<num.length;i++){
            for (int j=i;j>0;j--){
                if (num[j]<num[j-1]){
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num={67,76,44,33,23,87,56,53,55,0};
        InsertSort(num);
        System.out.println(Arrays.toString(num));
    }

}
