package DP;

/**
 * Created by hzdmm on 2017/8/25.
 * 题目:
 There are N children standing in a line. Each child is assigned a rating value.
 You are giving candies to these children subjected to the following requirements:
 Each child must have at least one candy.
 Children with a higher rating get more candies than their neighbors.
 What is the minimum candies you must give?
 题意:遍历两边(小的只和大的比，小的不和更小的比)，
 首先每个人得一块糖，第一遍从左到右，若当前点比前一个点高就比前者多一块。
  这样保证了在一个方向上满足了要求。第二遍从右往左，若左右两点，左侧高于右侧，
 但左侧的糖果数不多于右侧，则左侧糖果数等于右侧糖果数+1，这就保证了另一个方向上满足要
 */
public class candy {
    public static int candy(int[] ratings) {
        int[] leftToRight = new int[ratings.length];
        int[] rightToLeft = new int[ratings.length];
        for (int i=0;i<leftToRight.length;i++){//保证当前的小孩的的右边那一侧是符合的
            if (i==0){
                leftToRight[i]=1;
            }else {
                if (ratings[i]>ratings[i-1]){
                    leftToRight[i]=leftToRight[i-1]+1;//
                }else {
                    leftToRight[i]=1;
                }

            }
        }

        for (int i=rightToLeft.length-1;i>=0;i--){
            if (i==rightToLeft.length-1){
                rightToLeft[i]=1;
            }else {
                if (ratings[i]>ratings[i+1]){//保证左侧的情况
                    rightToLeft[i]=rightToLeft[i+1]+1;//
                }else {
                    rightToLeft[i]=1;
                }

            }
        }

        int result= 0;
        for (int i=0;i<ratings.length;i++){//取两个数组中较小的那个数字
            result+=Math.max(leftToRight[i],rightToLeft[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candy = {0};
        int a= 1;
        int b = 1;
        System.out.println(candy(candy));
    }
}
