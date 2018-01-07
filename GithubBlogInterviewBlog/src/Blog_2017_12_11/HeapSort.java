package Blog_2017_12_11;

/**
 * Created by hzdmm on 2017/12/11.
 */
public class HeapSort {
    //1.建堆
    //2.调整最大堆
    public static int[] heapSort(int[] array){
        buildHeap(array);
        int n = array.length;
        for (int i=n-1;n>=1;i--){
            swap(array,0,i);
            adjustHeap(array,0,i);
        }
        return array;
    }
    /**
     * 构建大顶堆堆
     * 从最后一个非叶子结点开始调整堆。每次都是从父结点，左节点，右结点三者中选最大值与父结点交换
     * @param
     */
    private static void buildHeap(int[] array) {
        int n = array.length;
        for (int i=n/2-1;i>=0;i--){
            adjustHeap(array,i,n);
        }
    }
    /**
     * 调整堆
     * @param A
     * @param idx
     * @param max 堆的大小
     */
    private static void adjustHeap(int[] A, int idx, int max) {
        int left = 2 * idx +1;//左孩子的下标
        int right = left + 1;//右孩子的下标
        int largest = 0;//三个节点中间的最大值
        if (left<max && A[left]>A[idx]){
            largest = left;
        }else {
            largest = idx;
        }

        if (right<max&&A[right]>A[largest]){
            largest = right;
        }

        if (largest != idx){
            swap(A,largest,idx);//从左节点，右结点中选最大值与父结点交换
            adjustHeap(A,largest,max);
        }
    }

    private static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
