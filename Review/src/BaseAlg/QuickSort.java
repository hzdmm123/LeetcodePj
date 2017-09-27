package BaseAlg;

/**
 * Created by hzdmm on 2017/4/6.
 */
public class QuickSort {
    public void quickSort(int[] array,int left,int right){
        if (left>right){
            return;
        }
        int pivot = partion(array,left,right);//一次划分找到一个基准点，然后对下面的地方做二分法
        quickSort(array,left,pivot-1);
        quickSort(array,pivot+1,right);
    }

    private int partion(int[] array, int left, int right) {
            int pivotkey = array[left];
        int pivotpoint = left;
        while (left<right){
            while (left<right&&array[right]>pivotkey){
                right--;
            }
            while (left<right&&array[left]<pivotkey){
                left++;
            }
            swap(array,left,right);//大的到右边，小的到左边
        }
        swap(array,pivotpoint,left);//把pivot交换到中间
        return left;

    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
