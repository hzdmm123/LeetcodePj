package DP;

/**
 * Created by hzdmm on 2017/4/6.
 * leetcode 198
 */
public class HouseRobber {

    public static int[] result;
    public int rob1(int[] array){
        return help1(array.length-1,array);
    }

    private int help1(int i, int[] array) {
        if (i<0){
            return 0;
        }
        return Math.max(help1(i-1,array),help1(i-2,array)+array[i]);
    }




    public int rob2(int[] array){
        result = new int[array.length];
        for (int i=0;i<array.length;i++){
            result[i]=-1;
        }
        return help2(array.length-1,array);
    }

    private int help2(int i, int[] array) {
        if (i<0){
            return 0;
        }

        if (result[i]>0){
            return result[i];
        }
        result[i] = Math.max(help1(i-1,array),help1(i-2,array)+array[i]);
        return result[i];
    }



    public int rob3(int[] array){
        if (array==null||array.length==0){
            return 0;
        }
        result = new int[array.length];
        result[0] = array[0];
        result[1] = Math.max(array[0],array[1]);
        for (int i=2;i<array.length;i++){
            result[i]=Math.max(result[i-1],result[i-2]+array[i]);
        }
        return result[array.length-1];
    }
}
