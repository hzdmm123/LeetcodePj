package Unit_04;

/**能num{1,5,10}          aim=15 求能够用num中的元素组成的在15 的最大种类数
 * Created by hzdmm on 2017/2/26.
 */
public class Problem_U4_04_SumsOfSwitchMoney1 {
    //暴力搜索算法
    public static int coins1(int[] array,int aim){
        if (array==null||array.length==0||aim<0){
            return 0;
        }
        return process(array,0,aim);
    }

    /**
     *
     * @param array 定的货币面值的种类
     * @param index 从哪个index开始到结束的array.length-1的钱书
     * @param aim 代表换成的钱
     * @return
     */
    private static int process(int[] array, int index, int aim) {
        int res = 0;
        if (index==array.length){
            res = aim==0 ?1:0;
           }else {
        for (int i=0;array[index] * i<=aim;i++) {//当前的货币不超过aim
            res += process(array, index + 1, aim - array[index] * i);
        }
    }
        return res;

    }

    public static void main(String[] args) {
        int[] array={5,10,25,1};
        System.out.print(coins1(array,15));
    }
}
