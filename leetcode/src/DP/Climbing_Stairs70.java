package DP;

/**
 * Created by hzdmm on 2017/4/16.
 * 70. Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 Note: Given n will be a positive integer.
 */
public class Climbing_Stairs70 {
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public int climbStairs2(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] result = new int[n+1];
        result[0]=0;
        result[1]=1;
        result[2]=2;
        for (int i=3;i<=n;i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result[n];

    }
}
