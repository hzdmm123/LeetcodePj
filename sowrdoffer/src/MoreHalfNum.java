/**
 * Created by hzdmm on 2017/3/14.
 */
public class MoreHalfNum {
    public static int mainNum(int[] array){
        if (array==null){
            return 0;
        }
        int count=0;
        int mainNum=0;
        for (int i=0;i<array.length-1;i++){
            if (count==0){
                mainNum=array[i];
                count=1;
            }else if (mainNum==array[i]){
                count++;
            }else {
                count--;
            }
        }
        int sum=0;
        for (int i=0;i<array.length;i++){
            if (mainNum==array[i]){
                sum++;
            }
        }
        if (sum>=array.length/2){
            return mainNum;
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] array={1,2,3,2,2,2,5,4,2};
        System.out.println(mainNum(array));
    }
}
