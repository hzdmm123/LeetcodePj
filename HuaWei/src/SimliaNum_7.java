import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 * 链接：https://www.nowcoder.com/questionTerminal/3ab09737afb645cc82c35d56a5ce802a
 来源：牛客网

 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。

 输入描述:
 输入一个正浮点数值


 输出描述:
 输出该数值的近似整数值

 (function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


 输入例子:
 5.5


 输出例子:
 6
 */
public class SimliaNum_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            float f = s.nextFloat();
            int r = (int)f;
            if (f-r>=0.5&&f-r<-1){
                System.out.println(r);
            }

        }
    }
}
