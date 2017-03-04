package Alg_ground;

/**
 * Created by hzdmm on 2016/10/26.
 * 有一批共n个集装箱要装上2艘载重量分别为c1和c2的轮船，其中集装箱i的重量为wi，且
 且∑wi <= c1 + c2
 装载问题要求确定是否有一个合理的装载方案可将这个集装箱装上这2艘轮船。如果有，找出一种装载方案。

 */
public class ContainLoadingProblem {
    public static int n;//集装箱数
    public static double[] weight;//集装箱重量数组
    public static double Firstlimitweight;//第一艘轮船的载重量
    public static double currentweight;//当前载重量
    public static double bestweight;//当前最优载重量
    public static double remainweight;//剩余集装箱重量
    public static int[] x;//当前解
    public static int[] bestx;//当前最优解

    public static double maxLoading(double[] weightArray , double c1Weight){
        n = weightArray.length-1;
        weight = weightArray;
        Firstlimitweight = c1Weight;
        currentweight = 0;
        bestweight = 0;
        x = new int[n+1];
        bestx= new int[n+1];
        for (int i=1;i<=n;i++){
            remainweight=remainweight+weight[i];
        }//初始化最大剩余量
        backtrack(1);//计算最优装载量

        return bestweight;
    }
    //开始回溯算法
    public static void backtrack(int i){
        //搜索i层节点
        if (i>n){//到达节点
            if (currentweight > bestweight){
                for (int j=1;j<=n;j++){
                    bestx[j]= x[j];

                }
                bestweight = currentweight;
            }
            return;
        }
        remainweight -= weight[i];
        if (currentweight+weight[i]<=Firstlimitweight){//搜索左子树左子树的标志为1
            x[i]=1;
            currentweight+=weight[i];
            backtrack(i+1);
            currentweight-=weight[i];//恢复现场
        }

        if (currentweight+remainweight>bestweight){//搜索右子树右子树的标志为0
            x[i]=0;
            backtrack(i+1);
        }
        remainweight+=weight[i];//恢复现场
    }

    public static void main(String[] args) {
        double[] weight ={4.1,5.2,6.3,7.4,8.5,9.6,10.7,11.8,12.9,3.2};
        double c1=40.0;
        double c2=50.0;
        int n = weight.length-1;
        double weight1=maxLoading(weight,c1);//获得1号船的最大装载
        double weight2=0;
        for (int i=0;i<=n;i++){
            weight2+=weight[i]*(1-bestx[i]);//剩下的没装的全部塞进去
        }
        if (weight2>c2){
            System.out.println("无法将所有的集装箱");
        }else{
            System.out.println("装入第一艘船的集装箱重量是："+Double.toString(weight1).substring(0,4));
            System.out.println("装入第二艘船的集装箱重量是："+Double.toString(weight2).substring(0,4));
            for (int i=0;i<=n;i++){
                if (bestx[i]==1){
                    System.out.println("集装箱"+Integer.toString(i+1)+"装入第一艘船");
                }else{
                    System.out.println("集装箱"+Integer.toString(i+1)+"装入第二艘船");
                }
            }
        }
    }

}
