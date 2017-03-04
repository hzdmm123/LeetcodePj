package Unit_08;

/**
 * Created by hzdmm on 2016/12/3.
 */
public class Problem_U8_03_printzhiMatrix {
    public static void printZhiMatrix(int[][] matrix){
        int tr = 0;
        int tc = 0;
        int dr = 0;
        int dc = 0;
        int endr = matrix.length-1;
        int endc = matrix[0].length-1;
        boolean fromup = false;//表示从上到下还是从下到上（斜着的）
        while (tr!=endr+1){
            printlevel(matrix,tr,tc,dr,dc,fromup);
            tr = tc == endc?tr+1:tr;
            tc = tc == endc?tc:tc+1;
            dc = dr == endr?dc+1:dc;
            dr = dr == endr?dr:dr+1;
            fromup = !fromup;
        }
        System.out.println();
    }

    public static void printlevel(int[][] m, int tr, int tc, int dr, int dc, boolean fromup) {
        if (fromup){
            while (tr!=dr+1){
                System.out.print(m[tr++][tc--] +" ");
            }
        }else {
            while (dr !=tr-1){
                System.out.print(m[dr--][dc++]+" ");
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Problem_U8_03_printzhiMatrix.printZhiMatrix(matrix);
    }

}
