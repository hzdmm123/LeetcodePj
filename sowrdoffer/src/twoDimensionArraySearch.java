/**
 * Created by hzdmm on 2017/8/23.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class twoDimensionArraySearch {
    public static boolean findTargetNum(int[][] array,int arget){
        int len = array.length-1;
        int i=0;
        while (len>=0&&i<array[0].length){//如果不写0可能只有一行
            if (array[len][i]>arget){
                len--;
            }else if (array[len][i]<arget){
                i++;
            }else {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(findTargetNum(a,5));
    }
}
