/**
 * Created by hzdmm on 2017/3/9.
 */
public class rotateArray {
    public int rotateArray(int[] array){
        for (int i=0;i<array.length-1;i++){
            if (array[i+1]>array[i]){
                return array[i+1];
            }
        }
        return 0;
    }
    public int rotateArray2(int[] array){
        if (array==null||array.length==0){
            return -1;
        }
        int mid=0;
        int start=0;
        int end=array.length-1;
        while (true){
            if (start==end){
                return start;
            }else if (start+1==end){
                if (array[start]>array[end]) return start;
                return end;
            }else {
                mid=(start+end)/2;
                if (array[mid]>array[mid]-1&&array[mid]>array[mid+1]) return mid;
                else if (array[mid-1]>array[mid+1]) end=mid-1;
                else start=mid+1;
            }
        }
    }

    public int rotateArray3(int[] nums){
        int start=0;
        int mid1;
        int mid2;
        int end=nums.length-1;
        while (start<end){
            mid1=(start+end)/2;
            mid2=mid1+1;
            if (nums[mid1]<nums[mid2]){
                start=mid2;
            }else {
                end=mid1;
            }

        }
        return start;
    }
}
