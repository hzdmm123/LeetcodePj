package autumn;

import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/25.
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 输入描述:
 每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。


 输出描述:
 输出一行表示最大的乘积。

 输入例子:
 3
 7 4 7
 2 50

 输出例子:
 49
 */
public class chrous {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()){
            int n = cin.nextInt();
            int[] arr = new int[n+1];
            for(int i=1;i<=n;i++){
                arr[i] = cin.nextInt();
            }

            int k = cin.nextInt();
            int d = cin.nextInt();
            long[][] fmax = new long[k+1][n+1];//记录最大乘积
            long[][] fmin = new long[k+1][n+1];//记录最小乘积
            long res = Integer.MIN_VALUE;

            for (int i=1;i<=n;i++){
                fmax[1][i]=arr[i];
                fmin[1][i]=arr[i];
                for (int p=2;p<=k;p++){
                    for (int j=i-1;j>0&&i-j<d;j--){
                        fmax[k][i]=Math.max(fmax[k][i],Math.max(fmax[k-1][j]*arr[i],fmin[k-1][j]*arr[i]));
                        fmin[k][i]=Math.min(fmin[k][i],Math.min(fmin[k-1][j]*arr[i],fmin[k-1][j]*arr[i]));
                    }
                }
                res = Math.max(res ,fmax[k][i]);
            }
            System.out.println(res);

        }
    }
}
