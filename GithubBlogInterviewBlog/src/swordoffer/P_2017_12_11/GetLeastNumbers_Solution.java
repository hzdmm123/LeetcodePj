package swordoffer.P_2017_12_11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hzdmm on 2017/12/11.
 */
public class GetLeastNumbers_Solution {
    /**
     * 先排序再取前K个值
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution_i(int[] input,int k){
        ArrayList<Integer> res = new ArrayList<>();
        if (input==null||input.length<1||k<0||k>input.length){
            return res;
        }

        Arrays.sort(input);

        for (int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }

    /**
     * 基于快排的partition思想
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution_ii(int[] input,int k){
        ArrayList<Integer> res = new ArrayList<>();
        if (input.length<k){
            return res;
        }

        findKmin(input,0,input.length-1,k);
        for (int i=0;i<k;i++){
            res.add(input[i]);
        }

        return res;
    }

    private void findKmin(int[] input, int begin, int end, int k) {
        if (begin<end){
            int pos = partition(input,begin,end);
            if (pos==-1){
                return;
            }else if (pos < k-1){
                findKmin(input,pos+1,end,k);
            }else {
                findKmin(input,begin,pos-1,k);
            }
        }
    }

    private int partition(int[] input, int begin, int end) {
        int pivot = input[begin];
        while (begin<end){
            while (begin<end&&input[end]>=pivot){
                end--;
            }
            input[begin] = input[end];
            while (begin<end&&input[begin]<=pivot){
                begin++;
            }
            input[end] = input[begin];
        }
        input[begin] = pivot;
        return begin;
    }


    /**
     * 基于堆排序
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //检查输入的特殊情况
        if(input==null || input.length<=0 || input.length<k){
            return list;
        }
        //构建最大堆
        for(int len=k/2-1; len>=0; len--){
            adjustMaxHeapSort(input,len,k-1);
        }
        //从第k个元素开始分别与最大堆的最大值做比较，如果比最大值小，则替换并调整堆。
        //最终堆里的就是最小的K个数。
        int tmp;
        for(int i=k; i<input.length; i++){
            if(input[i]<input[0]){
                tmp=input[0];
                input[0]=input[i];
                input[i]=tmp;
                adjustMaxHeapSort(input,0,k-1);
            }
        }
        for(int j=0; j<k; j++){
            list.add(input[j]);
        }
        return list;
    }
     
    public void adjustMaxHeapSort(int[] input, int pos, int length){
        int temp;
        int child;
        for(temp=input[pos]; 2*pos+1<=length; pos=child){
            child=2*pos+1;
            if(child<length && input[child]<input[child+1]){
                child++;
            }
            if(input[child]>temp){
                input[pos]=input[child];
            }else{
                break;
            }
        }
        input[pos]=temp;
    }
}
