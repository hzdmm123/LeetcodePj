/**
 * Created by hzdmm on 2016/12/3.
 * 按照圈去打印
 */
public class Problem_U8_01_RoundPrintmatrix {
    public static void spiralOderPrint(int[][] matrix){
        int tr = 0;
        int tc = 0;
        int dr = matrix.length-1;
        int dc = matrix[0].length-1;
        while(tr<=dr && tc <=dc){
            printEdge(matrix,tr++,tc++,dr--,dc--);
        }
    }

    private static void printEdge(int[][] m, int tr, int tc, int dr, int dc) {
        if (tr==dr){
            for (int i=tc;i<=dc;i++){
                System.out.print(m[tr][i]+" ");
            }
        }else if (tc==dc){
            for (int i=tr;i<=dr;i++){
                System.out.print(m[tc][i]+" ");
            }
        }else{
            int curr = tr;
            int cuuc = tc;
            while (cuuc != dc){
                System.out.print(m[tr][cuuc]+" ");
                cuuc++;
            }
            while(curr != dr){
                System.out.print(m[curr][dc]+" ");
                curr++;
            }
            while(cuuc !=tc){
                System.out.print(m[dr][cuuc]+" ");
                cuuc--;
            }
            while(curr !=tr){
                System.out.print(m[curr][tc]+" ");
                curr--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] maxtri={{1,2,3},{4,5,6},{7,8,9}};
        spiralOderPrint(maxtri);
    }
}
