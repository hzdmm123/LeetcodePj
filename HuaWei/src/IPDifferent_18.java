import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hzdmm on 2017/4/5.
 * 题目描述
 请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。

 所有的IP地址划分为 A,B,C,D,E五类

 A类地址1.0.0.0~126.255.255.255;

 B类地址128.0.0.0~191.255.255.255;

 C类地址192.0.0.0~223.255.255.255;

 D类地址224.0.0.0~239.255.255.255；

 E类地址240.0.0.0~255.255.255.255



 私网IP范围是：

 10.0.0.0～10.255.255.255

 172.16.0.0～172.31.255.255

 192.168.0.0～192.168.255.255



 子网掩码为前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
 本题暂时默认以0开头的IP地址是合法的，比如0.1.1.2，是合法地址


 输入描述:
 多行字符串。每行一个IP地址和掩码，用~隔开。


 输出描述:
 统计A、B、C、D、E、错误IP地址或错误掩码、私有IP的个数，之间以空格隔开。

 输入例子:
 10.70.44.68~255.254.255.0
 1.0.0.1~255.0.0.0
 192.168.0.2~255.255.255.0
 19..0.~255.255.255.0

 输出例子:
 1 0 1 0 0 2 1
 */
public class IPDifferent_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int typeA=0;
        int typeB=0;
        int typeC=0;
        int typeD=0;
        int typeE=0;
        int errorIPOrMaskCode = 0;
        int privateIP=0;
        while (scanner.hasNext()){
            String ipt = scanner.nextLine();
        String[] ipAndMaskCode = ipt.split("~");
        String ip = ipAndMaskCode[0];
        String maskCode = ipAndMaskCode[1];
        if (!isValidFormat(ip)||!isValidFormat(maskCode)){
            errorIPOrMaskCode++;
            continue;
        }

        if (!validMaskCode(maskCode)){
            errorIPOrMaskCode++;
            continue;
        }

        String finstr = ip.substring(0,ip.indexOf("."));
        int fn = Integer.valueOf(finstr);
        if (fn>=1&&fn<127){
            typeA++;
        }else if (fn>=128&&fn<192){
            typeB++;
        } else if (fn>=192&&fn<224){
            typeC++;
        }else if (fn>=224&&fn<240){
            typeD++;
        }else if (fn>=240&&fn<=255){
            typeE++;
        }


        String ipSubStr = ip.substring(ip.indexOf(".")+1);
        String sbStr = ipSubStr.substring(0,ipSubStr.indexOf("."));
        int sn = Integer.valueOf(sbStr);
        if (fn==0||(fn==172&&sn>=16&&sn<=31)||fn==1){
            privateIP++;
        }

        }
        System.out.printf("%d %d %d %d %d %d %d%n",typeA,typeB,typeC,typeD,typeE,errorIPOrMaskCode,privateIP);
    }
    public static  boolean isValidFormat(String ip){
        boolean res = true;
        if (ip==null||"".equals(ip)) return false;
        Pattern pattern = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$");
        Matcher matcher = pattern.matcher(ip);
        if (matcher.matches()){
            String[] nums = ip.split("\\.");
            for (String num : nums){
                int n = Integer.valueOf(num);
                if (n<0||n>255){
                    res = false;
                    break;
                }
            }
        }else {
            res = false;
        }
        return res;

    }

    public static boolean validMaskCode(String maskCode){
        boolean res = true;
        String[] nums = maskCode.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String num : nums){
            int n = Integer.valueOf(num);
            sb.append(binaryString(n));
        }
        int firstIndexof0= sb.indexOf("0");
        int lastIndexof1 = sb.lastIndexOf("1");
        if (firstIndexof0<lastIndexof1){
            res = false;
        }
        return res;

    }

    public static String binaryString(int n){
        StringBuilder sb = new StringBuilder();
        int flag = 1<<7;
        for (int i=0;i<8;i++){
            int val = (flag&n)==0?0:1;
            sb.append(val);

            n<<=1;
        }
        return sb.toString();

    }
}
