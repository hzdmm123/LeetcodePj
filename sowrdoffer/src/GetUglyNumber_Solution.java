/**
 * Created by hzdmm on 2017/4/12.
 * 题目描述
 把只包含素因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数
 */
public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        int count=0;
        int num=0;
        while (count<index){
            while (num%2==0){
                num=num/2;
            }
            while (num%3==0){
                num=num/3;
            }
            while (num%5==0){
                num=num/5;
            }
            if (num==1){
                count++;
            }
            num++;
        }
        return num;
    }

    public int getUgly(int index){
        if (index<0){
            return 0;
        }
        int[] arry =new int[index];
        int muti2=0;
        int muti3=0;
        int muti5=0;
        arry[0]=1;
        for (int i=1;i<index;i++){
            int min=Math.min(arry[muti2]*2,Math.min(arry[muti3]*3,arry[muti5]*5));//查找上一次的2 3 5 然后保存
            arry[i]=min;
            if (arry[muti2]*2==arry[i]) muti2++;
            if (arry[muti3]*3==arry[i]) muti3++;
            if (arry[muti2]*5==arry[i]) muti5++;
        }
        return arry[index-1];
    }

}
