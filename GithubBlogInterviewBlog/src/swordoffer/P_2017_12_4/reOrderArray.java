package swordoffer.P_2017_12_4;

/**
 * Created by hzdmm on 2017/12/4.
 */
public class reOrderArray {
    public void reOrderArray(int[] nums){
        //找到左边的第一个偶数，然后偶数后面的找到第一个奇数
        for(int i=0;i<nums.length;i++){
            int target;
            if (nums[i]%2==0){
                for (int j=i;j<nums.length;j++){
                    if (nums[j]%2==1){
                        target = nums[j];
                        while (j>i){
                            nums[j] = nums[j-1];
                            j--;
                        }
                        nums[j] = target;//此时j==i i也对
                        i++;
                    }
                }
                break;
            }
        }
    }
    public void reOrderArray_i(int [] array) {
        int[] newarray = new int[array.length];
        int m=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                newarray[m++]=array[i];
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                newarray[m++]=array[i];
            }
        }
        for(int i=0;i<newarray.length;i++){
            array[i]=newarray[i];
        }

    }
}
