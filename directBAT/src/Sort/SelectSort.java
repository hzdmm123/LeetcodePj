package Sort;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/25.
 */
public class SelectSort {
    public static void selectSort(int[] num){
        int temp;
        int key=0;
        for (int i=0;i<num.length-1;i++){//在i-n的长度的数组上每次取得最小值，然后放到前面
            key=i;//记录当年位置，准备比较
            for (int j=i+1;j<num.length;j++){
                key = num[key]>num[j] ? j : key;//找到当前位置之后的最小值的下标
            }
            if (num[i]>num[key]){
                temp=num[i];
                num[i] = num[key];
                num[key]=temp;

            }

        }
    }

    public static void main(String[] args) {
        int[] num={67,76,44,33,23,87,56,53,55,0};
        selectSort(num);
        System.out.println(Arrays.toString(num));
    }
}
