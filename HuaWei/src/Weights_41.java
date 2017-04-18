import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 题目描述
 现有一组砝码，重量互不相等，分别为m1,m2,m3…mn；
 每种砝码对应的数量为x1,x2,x3...xn。现在要用这些砝码去称物体的重量，问能称出多少中不同的重量。

 注：
 称重重量包括0

 方法原型：public static int fama(int n, int[] weight, int[] nums)


 输入描述:
 输入包含多组测试数据。

 对于每组测试数据：

 第一行：n --- 砝码数(范围[1,10])

 第二行：m1 m2 m3 ... mn --- 每个砝码的重量(范围[1,2000])

 第三行：x1 x2 x3 .... xn --- 每个砝码的数量(范围[1,6])


 输出描述:
 利用给定的砝码可以称出的不同的重量数

 输入例子:
 2
 1 2
 2 1

 输出例子:
 5
 * Created by hzdmm on 2017/3/31.
 */
public class Weights_41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] weight = new int[n];
            int[] num = new int[n];
            for (int i=0;i<n;i++){
                weight[i] = in.nextInt();
            }
            for (int i=0;i<n;i++){
                num[i] = in.nextInt();
            }
            //处理输入的值的初始化
            //将第一个砝码所有可能值的种类放入
            Set<Integer> res = new HashSet<>();
            for (int i=0;i<=num[0];i++){
                res.add(weight[0]*i);
            }//从第二个开始
            for (int i=1;i<weight.length;i++){
                ArrayList<Integer> list = new ArrayList(res);//每次都把res出事话到list中
                for (int j=1;j<=num[i];j++){//各种重量可能
                    for (int k=0;k<list.size();k++){
                        res.add(list.get(k)+j*weight[i]);//把没种可能都加上1-j的种类数
                    }
                }
            }
            System.out.println(res.size());

        }
    }
}
