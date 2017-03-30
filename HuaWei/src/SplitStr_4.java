
import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/27.
 * 题目描述
 •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

 输入描述:
 连续输入字符串(输入2次,每个字符串长度小于100)


 输出描述:
 输出到长度为8的新字符串数组

 输入例子:
 abc
 123456789

 输出例子:
 abc00000
 12345678
 90000000
 */
public class SplitStr_4 {
/*    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1="";
        String str2="";
        while (in.hasNext()){
            str1 = in.nextLine();
            str2 = in.nextLine();
        }
        ParseStr(str1);
        ParseStr(str2);
    }

    private static void ParseStr(String str2) {
        int m = str2.length()/8;
        int n =0;
        while (8*(n+1)<m){
          System.out.println(str2.substring(n*8,(n+1)*8-1));
          n++;
        }
        String remain = str2.substring((n+1)*8);
        if (str2.length()%8!=0){
            for (int i=0;i<8-str2.length()%8;i++){
                remain+=0;
            }
        }

        System.out.println(remain);
    }*/
public static void main1(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()){
        String s = in.nextLine();
        if (s.length()%8!=0){
            s+="00000000";
        }
        while (s.length()>8){
            System.out.println(s.substring(0,8));
            s = s.substring(8);
        }
    }
}
/*import java.util.*;
public class Main{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){        
            String s = new String(sc.nextLine());
            if(s.length()%8 !=0 )
                s = s + "00000000";
             
            while(s.length()>=8){
                System.out.println(s.substring(0, 8));
                s = s.substring(8);
            }
        }
    }
    }*/
public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    while (in.hasNext()){
        //有一行数据的话就存起来
        String s = in.nextLine();
        if (s.length()%8!=0){//不是整除
            s=s+"00000000";

        }
        while (s.length()>=8){
            System.out.print(s.substring(0,8));
            s = s.substring(8);
        }
    }
}

}
