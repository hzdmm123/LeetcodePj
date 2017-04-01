/**
 * Created by hzdmm on 2017/2/13.
 */
public class FindNumInArray_03 {
    public static void main(String[] args) {
        int[][] num=new int[5][3];
        System.out.println(num.length);
        System.out.println(num[0].length);
    }

    /**
     * 在一个二维数组中寻找值
     * @param num
     * @param val
     * @return
     */
    public boolean SearchNumDimensionalArray(int[][] num,int val){
        if (num==null){
            return false;
        }
        int c=num.length;
        int r=num[0].length;
        int i=0;
        int j=r-1;
        while (i<c&&j>=0){
            if (num[i][j]==val){
                return true;
            }else if (num[i][j]>val){
                j--;
            }
            else {
                i++;
            }
        }

        return false;
    }
}
