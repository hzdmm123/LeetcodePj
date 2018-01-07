package swordoffer.P_2017_12_3;

/**
 * Created by hzdmm on 2017/12/3.
 */
public class minNumberInRotateArray {

    /**
     * 直接找分界点
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int[] array){
        for (int i=0;i<array.length;i++){
            if (array[i+1]<array[i]){
                return array[i+1];
            }
        }
        return 0;
    }

    /**
     * 二分法
     * @param array
     * @return
     */
    public int minNumberInRotateArray_iii(int[] array){
        if (array.length==0){
            return 0;
        }

        int left = 0;
        int right = array.length-1;
        int middle = -1;
        while (array[left]>=array[right]){
            if (right-left==1){
                middle = right;
                break;
            }

            middle = left + (right-left)/2;
            if (array[middle]>=array[left]){
                left = middle;
            }

            if (array[middle]<=array[right]){
                middle = right;
            }
        }
        return array[middle];
    }
}
