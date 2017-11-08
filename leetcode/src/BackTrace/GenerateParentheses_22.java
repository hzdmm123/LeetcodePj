package BackTrace;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2017/11/6.
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 *
 * ]
 */
public class GenerateParentheses_22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        help(res, "", 0, 0, n);
        return res;
    }

    public void help(List<String> list, String str, int open, int close, int max) {
        if (close == max) {//闭括号比对数相等
            list.add(str);
            return;
        }

        if (open < max) {//开括号个数小于max
            help(list, str + "(", open + 1, close, max);
        }
        if (close < open) {//当前的闭括号是一定要小于开括号的
            help(list, str + ")", open, close + 1, max);
        }

    }
}
