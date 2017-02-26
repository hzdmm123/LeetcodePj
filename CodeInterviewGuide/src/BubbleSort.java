import java.util.Arrays;

/**
 * Created by hzdmm on 2016/9/26.
 * 冒泡排序
 * * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * * 针对所有的元素重复以上的步骤，除了最后一个。
 * * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {
    public static void bubbleSort(int[] num){
        int temp = 0;
        int size = num.length;
        for (int i=0;i<size-1;i++){
            for (int j=0;j<size-1-i;j++){
                if (num[j]>num[j+1]){
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]=temp;
                }

            }
        }
    }
    public static void main(String[] args){
        int[] num={67,76,44,33,23,87,56,53,55,0};
        BubbleSort.bubbleSort(num);
        System.out.println(Arrays.toString(num));

    }

}
