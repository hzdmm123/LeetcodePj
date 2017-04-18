    import java.util.Scanner;

    /**
     * 题目描述
     编写一个程序，将输入字符串中的字符按如下规则排序。
     规则1：英文字母从A到Z排列，不区分大小写。
     如，输入：Type 输出：epTy
     规则2：同一个英文字母的大小写同时存在时，按照输入顺序排列。
     如，输入：BabA 输出：aABb
     规则3：非英文字母的其它字符保持原来的位置。
     如，输入：By?e 输出：Be?y
     样例：
     输入：
     A Famous Saying: Much Ado About Nothing(2012/8).
     输出：
     A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).


     输入描述:



     输出描述:


     输入例子:
     A Famous Saying: Much Ado About Nothing (2012/8).

     输出例子:
     A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
     * Created by hzdmm on 2017/3/30.
     */
    public class CharArraySort_26 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                StringBuilder sb = new StringBuilder();
                int shift = 'A' - 'a';
                for (int i = 0; i < 26; i++) {//按照26个字母添加
                    char match = (char) ('a' + i);//ask||
                    for (int j = 0; j < str.length(); j++) {//符合大小写就添加
                        if (str.charAt(j) == match || str.charAt(j) == (match + shift)) {
                            sb.append(str.charAt(j));
                        }
                    }
                }
                for (int i = 0; i < str.length(); i++) {
                    char m = str.charAt(i);
                    if ((m >= 'A' && m <= 'Z') || (m >= 'a' && m <= 'z')) {
                        continue;
                    } else {//记录位置插入
                        sb.insert(i, m);
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
