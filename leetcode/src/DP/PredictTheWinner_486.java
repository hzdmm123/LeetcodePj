package DP;

/**
 * Given an array of scores that are non-negative integers.
 * Player 1 picks one of the numbers from either end of the array followed by the player 2 and then player 1 and so on.
 * Each time a player picks a number, that number will not be available for the next player. T
 * his continues until all the scores have been chosen.
 * The player with the maximum score wins.

 Given an array of scores, predict whether player 1 is the winner. You can assume each player plays to maximize his score.
 * Created by hzdmm on 2017/9/18.
 */
public class PredictTheWinner_486 {
    public static boolean PredictTheWinner(int[] nums) {
        if (nums==null||nums.length==0){
            return false;
        }
        if (nums.length==1){
            return true;
        }
        return f(nums,0,nums.length-1)>s(nums,0,nums.length-1);
    }

    private static int f(int[] nums, int i, int j) {
        if (i==j){
            return nums[i];
        }
        //
        return Math.max(nums[i]+s(nums,i+1,j),nums[j]+s(nums,i,j-1));
    }

    private static int s(int[] nums, int i, int j) {
        if (i==j){
            return 0;
        }
        //得到的肯定是第一个选的小的值的总和s
        return Math.min(f(nums,i+1,j),f(nums,i,j-1));
    }

    public static void main(String[] args) {
        int[] nums={0};
        System.out.println(PredictTheWinner(nums));
    }

    public static boolean PredictTheWinner_II(int[] nums){
        if (nums==null||nums.length==0){
            return true;
        }

        int[][] f= new int[nums.length][nums.length];
        int[][] s = new int[nums.length][nums.length];
        for (int j=0;j<nums.length;j++){
            f[j][j]=nums[j];
            for (int i=j-1;i>=0;i--){
                f[i][j]=Math.max(nums[i]+s[i+1][j],nums[j]+s[i][j-1]);
                s[i][j]=Math.min(f[i+1][j],f[i][j-1]);
            }
        }
        return f[0][nums.length-1]>s[0][nums.length-1];
    }

}
