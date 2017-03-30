import java.util.*;

/**
 * Created by hzdmm on 2017/3/30.
 * 题目描述
 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。

 输入描述:
 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。


 输出描述:
 删除字符串中出现次数最少的字符后的字符串。

 输入例子:
 abcdd

 输出例子:
 dd
 笔
 */
public class deleteLeastOutChar_23
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            char[] c = sc.nextLine().toCharArray();
            Map<Character,Integer> map = new HashMap<>();
            //1.统计词频
            for (char c1 : c){
                if (!map.containsKey(c1)){
                    map.put(c1,1);
                }else {
                    map.put(c1,map.get(c1)+1);
                }
            }
            //2.找到最小的出现的次数
            Collection<Integer> c2= map.values();
            int index = Collections.min(c2);
            //3.拼接结果字符串
            StringBuilder sb = new StringBuilder("");
            for (char c1:c){
                if (map.get(c1)!=index){
                    sb.append(c1);
                }
            }
            System.out.println(sb.toString());

        }
    }
}
