package Bolg_2017_12_7;

/**
 * Created by hzdmm on 2017/12/7.
 */
public class QuickSort {
    public void quickSort(int[] nums,int low ,int high){
        int pivot;
        if (low<high){
            pivot = partition(nums,low,high);//分成两段
            quickSort(nums,low,pivot-1);//递归排序
            quickSort(nums,pivot+1,high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot;
        pivot = nums[low];//划分点
        while (low<high){
            while (low<high&&nums[high]>pivot){
                high--;
            }
            swap(nums,low,high);//比pivot小的调换过去
            while (low<high&&nums[low]<pivot){
                low++;
            }
            swap(nums,low,high);//比pivot大的调换过去
        }
        return low;
    }

    protected void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}
