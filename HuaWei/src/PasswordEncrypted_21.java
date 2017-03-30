import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/29.
 * 题目描述
 密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈. 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。

 假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，他通过一种算法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。

 他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，

 声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。


 输入描述:
 输入包括多个测试数据。输入是一个明文，密码长度不超过100个字符，输入直到文件结尾


 输出描述:
 输出渊子真正的密文

 输入例子:
 YUANzhi1987

 输出例子:
 zvbo9441987
        */
public class PasswordEncrypted_21 {

    private static final String dict1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";     
    private static final String dict2 = "bcdefghijklmnopqrstuvwxyza22233344455566677778889999";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String psw = sc.nextLine();
            System.out.println(deEntryptedpsw(psw));
        }
    }

    private static String deEntryptedpsw(String psw) {
        StringBuilder sb = new StringBuilder();
        char[] c = psw.toCharArray();
        for (char cha : c){
            int index = dict1.indexOf(cha);
            char re = index==-1? cha :dict2.charAt(index);
            sb.append(re);
        }
        return sb.toString();
    }
}
