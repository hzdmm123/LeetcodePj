package sort;

import java.util.Scanner;

/**
 * Created by hzdmm123 on 2018/4/5.
 */
public class Interst {
    public static void main(String[]  args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int length = in.nextInt();
        //输入的dna串不存在的时候
        if (s.length()==0||s==null){
            return;
        }
        //当子串的长度大于总长度的时候
        if (length>s.length()){
            System.out.println(s);
        }
        int[] max = {0,0};
        for (int i = 0;i<=s.length()-length;i++){

            int sum = 0;
            for (int j= i;j<i+length;j++){
                if (s.charAt(j)=='G'||s.charAt(j)=='C'){
                    sum++;
                }

                if (sum>max[0]){
                    max[0] = sum;
                    max[1] = i;
                }
            }

        }
        System.out.println(s.substring(max[1],max[1]+length));

    }
}
