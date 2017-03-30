
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/28.
 * 题目描述
 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。

 输入：

 合法坐标为A(或者D或者W或者S) + 数字（两位以内）

 坐标之间以;分隔。

 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。

 下面是一个简单的例子 如：

 A10;S20;W10;D30;X;A1A;B10A11;;A10;

 处理过程：

 起点（0,0）

 +   A10   =  （-10,0）

 +   S20   =  (-10,-20)

 +   W10  =  (-10,-10)

 +   D30  =  (20,-10)

 +   x    =  无效

 +   A1A   =  无效

 +   B10A11   =  无效

 +  一个空 不影响

 +   A10  =  (10,-10)



 结果 （10， -10）


 输入描述:
 一行字符串


 输出描述:
 最终坐标，以,分隔

 输入例子:
 A10;S20;W10;D30;X;A1A;B10A11;;A10;

 输出例子:
 10,-10
 */
public class MovePos_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> res = new ArrayList<>();
        int x=0,y=0;
        while (in.hasNext()){
            String str = in.nextLine();
            String[] move =str.split(";");
            System.out.println(move.length);
            for (int i=0;i<move.length;i++){
                if (move[i].length()>3) continue;
                if (move[i].substring(0,1).equals("W")){
                    y=y+Integer.parseInt(move[i].substring(1));
                }else if (move[i].substring(0,1).equals("A")){
                    x=x-Integer.parseInt(move[i].substring(1));
                }else if (move[i].substring(0,1).equals("D")){
                    x=x+Integer.parseInt(move[i].substring(1));
                }else if (move[i].substring(0,1).equals("S")){
                    y=y-Integer.parseInt(move[i].substring(1));
                }else {
                    continue;
                }

            }
            System.out.println(x+","+y);
        }

    }
}
