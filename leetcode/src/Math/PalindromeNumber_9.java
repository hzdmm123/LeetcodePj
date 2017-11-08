package Math;

/**
 * Created by hzdmm on 2017/11/7.
 * <p>
 * <p>
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 判断一个数字是不是回文数字
 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int r = 0, t;
        t = x;
        while (t != 0) {
            r = r * 10 + t % 10;//反转
            t = t / 10;//这个是曲数字的
        }
        return r == x;
    }
}
