package swordoffer.P_2017_12_3;

/**
 * Created by hzdmm on 2017/12/3.
 */
public class Fibonacci {
    public int Fibonacci_i(int n){
        return Fibonacci_i(n-1)+Fibonacci_i(n-2);
    }

    public int Fibonacci_ii(int n){
        if (n<=0){
            return 0;
        }

        if (n==1||n==2){
            return 1;
        }
        int Prepre=1;
        int pre=1;
        int current=0;
        for (int i=3;i<n;i++){
            current = Prepre+pre;
            Prepre = pre;
            pre = current;
        }

        return current;
    }

}
