import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 7/11/2016.
 *
 *
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 Example:
 For num = 5 you should return [0,1,1,2,1,2].
 *
 *
 */
public class CountingBits {
    public int[] countBits(int num){
        int[] a =  new int [num];
        List<Integer> li = new ArrayList<>();
        for (int i=0;i<num;i++){
            Integer b =(Integer)a[i];
            b.bitCount(i);
            li.add(b.bitCount(i));
        }
         for(int j=0;j<li.size();j++){

         }
         return a;
    }

}
/*public class Solution {
    public int[] countBits(int num) {
        int[] f = new int[num+1];
        for(int i=0;i<=num;i++)
        {
            f[i]=f[i>>1]+(i&1);

        }
        return f;


    }
}*/

/*
public class Solution {
    public int[] countBits(int num) {
        int[] answer = new int[num+1];
        int offset = 1;
        for(int i = 1; i < answer.length; i++){
            if(offset * 2 == i) offset *= 2;
            answer[i] = 1 + answer[i - offset];
        }
        return answer;
    }
}*/
