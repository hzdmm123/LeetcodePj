/*
package alg;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class MaxLoading {

    public static void main(String[] args) {
        String s1=JOptionPane.showInputDialog(null,"输入货物数量：",
                "最优装载问题",JOptionPane.QUESTION_MESSAGE);
        n=Integer.parseInt(s1);
        w=new int [n];
        System.out.println("输出货物的重量数组：");
        for(int i=0;i
        String s2=JOptionPane.showInputDialog(null,"输入第一艘轮船的载重量：",
                "最优装载问题",JOptionPane.QUESTION_MESSAGE);
        c=Integer.parseInt(s2);
//x=new int [w.length];
        maxLoading(w,c,x);
        System.out.print("输出当前最优解:");

// Show frame
//frame.setVisible(true);
    }
    static int n;//集装箱数
    static int []w;//集装箱重量数组
    static int c;//第一艘轮船的载重量
    static int cw;//当前载重量
    static int bestw;//当前最优载重量
    static int r;//剩余集装箱重量
    static int []x;//当前解
    static int []bestx;//当前最优解
    public static int maxLoading(int[]ww,int cc,int[]xx){
        n=ww.length-1;
        w=ww;
        c=cc;
        bestw=0;
        x=new int [n+1];
        bestx=xx;
        for(int i=1;i<=n;i++)
            r+=w[i];
//计算最优装载重量
        backtrack(1);
        return bestw;
    }
    public static void backtrack(int i){
//搜索第i层结点
        if(i>n){//到达叶结点
            if(cw>bestw){
                for(int j=1;j<=n;j++)
                    bestx[j]=x[j];
                bestw=cw;
            }
            return;
        }
        r-=w[i];
        if(cw+w[i]<=c){//搜索左子树
            x[i]=1;
            cw+=w[i];
            backtrack(i+1);
            cw-=w[i];
        }
        if(cw+r>bestw){
            x[i]=0;
            backtrack(i+1);
        }
        r+=w[i];
    }

}*/
