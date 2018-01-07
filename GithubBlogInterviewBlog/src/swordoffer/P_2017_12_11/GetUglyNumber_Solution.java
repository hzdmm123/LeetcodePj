package swordoffer.P_2017_12_11;

/**
 * Created by hzdmm on 2017/12/11.
 */
public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index){
        if (index<=0){
            return 0;
        }

        int[] array = new int[index];
        int muti2 = 0;
        int muti3 = 0;
        int muti5 = 0;
        array[0] = 1;
        for (int i=1;i<index;i++){
            int min = Math.min(array[muti2]*2,Math.min(array[muti3]*3,array[muti5]*5));
            array[i] = min;
            if (array[muti2]*2==array[i]) muti2++;
            if (array[muti3]*3==array[i]) muti3++;
            if (array[muti5]*5==array[i]) muti5++;
        }

        return array[index-1];
    }
}
