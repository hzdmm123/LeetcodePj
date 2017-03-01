/**
 * Created by hzdmm on 2016/12/3.
 */
public class Problem_U8_02_Rotatematrix {
    public static void rotatematrix(int[][] matrix){
        int tr = 0;
        int tc = 0;
        int dr = matrix.length-1;
        int dc = matrix[0].length-1;
        while (tr<=dr && tc<=dc){
            rotateEdage(matrix,tr++,tc++,dr--,dc--);
        }
                }

public static void rotateEdage(int[][] m, int tr, int tc, int dr, int dc) {
        int times = dc-tc;
        int temp ;
        for (int i=0;i!=times;i++){
        temp = m[tr][tc+i];
        m[tr][tc+i] = m[dr-i][tc];
        m[dr-i][tc] = m[dr][dc-i];
        m[dr][dc-i] = m[tr+i][dc];
        m[tr+i][dc] = temp;
        }//一边一边转
        }

        }
