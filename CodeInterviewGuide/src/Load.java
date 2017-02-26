/*
package alg;

*/
/**
 * Created by hzdmm on 2016/10/28.
 *//*

*/
/**
 * 装载问题--回溯法
 * @author Lican
 *
 *//*

public class Load {
    static int n;//集装箱数目
    static int[] w;//集装箱重量数组
    static int c;//第一艘轮船的载重量
    static int cw;//当前载重量
    static int bestw;//当前最优载重量
    static int r;//剩余集装箱重量
    static int[] x;//当前解，记录从根至当前节点的路径
    static int[] bestx;//记录当前最优解
    public static int maxLoading(int[] ww,int cc){
        //初始化类数据成员,数组下标从1开始
        n=ww.length-1;
        w=ww;
        c=cc;
        cw=0;
        bestw=0;
        x=new int[n+1];
        bestx=new int[n+1];

        //初始化r，即剩余最大重量
        for(int i=1;i<=n;i++){
            r+=w[i];
        }

        //计算最优载重量
        backtrack(1);
        return bestw;
    }
    //回溯算法
    public static void backtrack(int i){
        //搜索第i层节点
        if(i>n){//到达叶节点
            if(cw>bestw){
                for(int j=1;j<=n;j++){
                    bestx[j]=x[j];
                }
                bestw=cw;
            }
            return;
        }
        r-=w[i];
        if(cw+w[i]<=c){//搜索左子树(约束函数)
            x[i]=1;//左子树标志为1
            cw+=w[i];
            backtrack(i+1);//搜索下一层
            cw-=w[i];//恢复现场，因为cw是全局变量
        }
        if(cw+r>bestw){//搜索右子树（限界函数）
            x[i]=0;//右子树标志为0
            backtrack(i+1);
        }
        r+=w[i];//恢复现场，r是全局变量
    }
    public static void main(String[] args) {
        int[] w={0,10,40,40};
        int c1=50;
        int c2=50;
        int n=w.length-1;
        int weight1=maxLoading(w,c1);
        int weight2=0;//保存第2艘船可能要装的重量
        for(int i=1;i<=n;i++)
            weight2+=w[i]*(1-bestx[i]);//剩余未装入的集装箱全部装入第二艘船，bestx[i]为1或者0
        if(weight2>c2)
            System.out.println("无法将全部集装箱装入两艘船。");
        else{
            System.out.println("第一艘船装入的重量是："+weight1);
            System.out.println("第二艘船装入的重量是："+weight2);
            for(int i=1;i<=n;i++){
                if(bestx[i]==1)
                    System.out.println("集装箱"+i+"装入第一艘船；");
                else
                    System.out.println("集装箱"+i+"装入第二艘船；");
            }
        }
    }
}
*/
/*
输出：
第一艘船装入的重量是：50
第二艘船装入的重量是：40
集装箱1装入第一艘船；
集装箱2装入第一艘船；
集装箱3装入第二艘船；
*/
