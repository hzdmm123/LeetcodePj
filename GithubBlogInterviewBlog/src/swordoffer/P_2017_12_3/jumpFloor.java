package swordoffer.P_2017_12_3;

/**
 * Created by hzdmm on 2017/12/3.
 */
public class jumpFloor {
    public int JumpFloor(int target) {
        if(target<=0){
            return -1;
        }
        if(target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    public int JumpFloor_ii(int target){
        if(target<=0){
            return -1;
        }
        if(target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }

        int first = 1; int second = 2; int third = 0;
        for (int i=3;i<=target;i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}
