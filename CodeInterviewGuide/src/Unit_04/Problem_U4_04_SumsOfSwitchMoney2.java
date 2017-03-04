package Unit_04;

/**
 * Created by hzdmm on 2017/2/26.
 */
public class Problem_U4_04_SumsOfSwitchMoney2 {
    //记忆搜索的方法
    public static int consin2(int[] array,int aim){
        if (array.length==0||aim<0||array==null){
            return 0;
        }
        int[][] map=new int[array.length+1][aim+1];
        return process(array,0,aim,map);

    }

    /**
     *
     * @param array
     * @param index
     * @param aim
     * @param map记忆的东西
     * @return
     */
    private static int process(int[] array, int index, int aim, int[][] map) {
        int res = 0;
        if (index==array.length){
            res = aim==0?1:0;
        }else {
        int mapValue=0;
        for (int i=0;array[index]*i<=aim;i++){
            mapValue = map[index+1][aim-array[index]*i];
            if (mapValue!=0){
                res+= mapValue==-1 ? 0:mapValue;//在map数组中是否记过，计算过就直接机上
            }else {
                res += process(array,index+1,aim-array[index]*i,map);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {5,10,25,1};
        System.out.println(consin2(array,15));
    }
}
