package Sort;

import java.util.Arrays;

/**
 * Created by hzdmm on 2017/2/25.
 */
public class BubbleSort {
    public static void BubbleSort(int[] num) {
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {//因为已经把最大的给冒到顶部了，然后就不需要再循环到num.length-1
                if (num[j] > num[j + 1]) {
                    temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;

                }
            }

        }
    }

        public static void main(String[] args) {
        int[] num = {67, 76, 44, 33, 23, 87, 56, 53, 55, 0};
        BubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
}
