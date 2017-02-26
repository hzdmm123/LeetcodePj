/**
 * Created by hzdmm on 2016/10/29.
 */

import java.util.Arrays;

public class FlowShop
{
    static int n; //作业数
    static int f1; //机器1完成处理时间
    static int f; //完成时间和
    static int bestf; //当前最优值

    static int[][] m; //各作业所需要的处理时间
    static int[] x;  //当前作业调度
    static int[] bestx; //当前最优作业调度
    static int[] f2; //机器2完成处理时间
    public static void trackback(int i) {
        //i用来指示到达的层数（第几步，从0开始），同时也指示当前执行完第几个任务
        if (i == n) { //得出一组最优值
            for (int j = 0; j < n; j++) {
                bestx[j] = x[j];
            }
            bestf = f;
        }
        else {
            for (int j = i; j < n; j++) {  //j用来指示选择了哪个任务（也就是执行顺序）  tb(0)进来了，不管怎么递归，就有j=0,1,2这三个过程，因此肯定能遍历完全
                f1 += m[x[j]][0];  //选择第x[j]个任务来执行
                if (i > 0) {  //选择出的不是第一个任务
                    f2[i] = ((f2[i - 1] > f1) ? f2[i - 1] : f1) + m[x[j]][1];  //从f2[i - 1] 和 f1中选一个大的出来
                }
                else {//选择出的是第一个任务
                    f2[i] = f1 + m[x[j]][1];
                }
                f += f2[i];
                if (f < bestf) {
                    swap(x, i, j);  //关键：把选择出的任务j调到当前执行的位置i
                    trackback(i + 1);  //选择下一个任务执行
                    swap(x, i, j);  //递归后恢复原样
                }
                f1 -= m[x[j]][0];  //递归后恢复原样
                f -= f2[i];
            }
        }
    }
    private static void swap(int[] x, int i, int j) {
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

    public static void main(String[] args)
    {
        n = 3;
        int[][] testm = {{2, 1}, {3, 1}, {2, 3}};
        m = testm;
        int[] testx = {0, 1, 2};
        x = testx;

        bestx = new int[n];
        f2 = new int[n];

        f1 = 0;
        f = 0;
        bestf = Integer.MAX_VALUE;
        trackback(0);  //起点可变用trackback(0)，如果从一定点开始，就要用trackback(1)
        for (int i=0;i<n;i++){
            bestx[i]=bestx[i]+1;
        }
        System.out.println("作业顺序是");
        System.out.println(Arrays.toString(bestx));
        System.out.print("最佳调度时间是：");
        System.out.println(bestf);
    }
}