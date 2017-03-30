
import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/28.
 * 题目描述
 密码要求:



 1.长度超过8位



 2.包括大小写字母.数字.其它符号,以上四种至少三种



 3.不能有相同长度超2的子串重复



 说明:长度超过2的子串


 输入描述:
 一组或多组长度超过2的子符串。每组占一行


 输出描述:
 如果符合要求输出：OK，否则输出NG

 输入例子:
 021Abc9000
 021Abc9Abc1
 021ABC9000
 021$bc9000

 输出例子:
 OK
 NG
 NG
 OK
 */
public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String psw = sc.nextLine();
            if (checkPassword(psw)&&checkDumplicate(psw)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }

    }

    public static boolean checkPassword(String s){
        char[] res = s.toCharArray();
        int low=0;
        int isnum=0;
        int up = 0;
        int other=0;
        if (res.length<8){
            return false;
        }
        for (int i=0;i<res.length;i++){
            if (res[i]>='0'&&res[i]<='9'){
                isnum=1;
            }else if (res[i]>='a'&&res[i]<='z'){
                low=1;
            }else if (res[i]>='A'&&res[i]<='Z'){
                up=1;
            }else {
                other=1;
            }
        }
        int ans=isnum+low+up+other;
        return ans>=3? true:false;
    }

    public static boolean checkDumplicate(String password){
        for (int i=0;i<password.length()-2;i++){
            String substr1 = password.substring(i,i+3);
            if (password.substring(i+1).contains(substr1)){
                return false;
            }
        }
        return true;
    }
}
