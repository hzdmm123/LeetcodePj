/**
 * Created by hzdmm on 2017/3/9.
 */
public class NumberOfOne10 {
    public static int Number(int n){
       // 记录数字中1的位数
        int result = 0;

        // JAVA语言规范中，int整形占四个字节，总计32位
        // 对每一个位置与1进行求与操作，再累加就可以求出当前数字的表示是多少位1
        for (int i = 0; i < 32; i++) {
            result += (n & 1);
            n >>>= 1;
        }

        // 返回求得的结果
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Number(5));
    }
}
