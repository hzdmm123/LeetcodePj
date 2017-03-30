import java.util.*;

/**
 * Created by hzdmm on 2017/3/27.
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），\
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
 * 请你协助明明完成“去重”与“排序”的工作。


 Input Param
 n               输入随机数的个数
 inputArray      n个随机整数组成的数组

 Return Value
 OutputArray    输出处理后的随机整数


 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。




 输入描述:
 输入多行，先输入随机整数的个数，再输入相应个数的整数


 输出描述:
 返回多行，处理后的结果

 输入例子:
 11
 10
 20
 40
 32
 67
 40
 20
 89
 300
 400
 15

 输出例子:
 10
 15
 20
 32
 40
 67
 89
 300
 400
 */
public class RandomNum_3 {
/*    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        TreeSet<Integer> res = new TreeSet<>();
        int n = in.nextInt();
        for (int i=0;i<n;i++){
            if (in.hasNext()){
                res.add(in.nextInt());
            }
        }

        for (Integer re:res){
            System.out.println(re);
        }

    }*/

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){

                int num = sc.nextInt();
                TreeSet<Integer> set = new TreeSet<Integer>();
                for(int i = 0 ; i < num ;i++){
                    int curr = sc.nextInt();
                    set.add(curr);
                }
                for(Integer i : set){
                    System.out.println(i);
                }
            }
        }


    }

