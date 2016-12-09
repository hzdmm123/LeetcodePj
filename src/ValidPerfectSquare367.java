/**
 * Created by hzdmm on 2016/10/25.
 */
public class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {
        int i=1;
        while(num > 0){
            num-=i;
            i+=2;
        }//根据公式 1 3 5 7 9 11 13 所得的结论
        return num==0;


/*        //二分法查找
        int low=1,high=num;
        long mid =(low+high)>>>1;
        while (low<high){
            if (mid * mid == num){
                return true;
            }else if (mid * mid <num){
                low = (int)mid+1;
            }else if(mid * mid > num){
                high = (int)mid-1;
            }

        }
        return false;*/

        //

        


    }
}
