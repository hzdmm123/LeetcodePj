package Alg_ground; /**
 * Created by hzdmm on 2016/9/23.
 */
import java.util.Scanner;

/*
 * n:表示输入矩阵是n*n的方阵
 * dr:表示特殊棋盘的行位置
 * dc:表示特殊棋盘的列位置
 * tr:表示当前所在棋盘的左上角的行位置
 * tc:表示当前所在棋盘的左上角的列位置
 *
 */
public class ChessBord {
    static int[][] matrix;
    static int count;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int T = in.nextInt();
            for(int i = 0; i < T; i++) {
                int n = in.nextInt();
                int dr = in.nextInt();
                int dc = in.nextInt();
                matrix = new int[n][n];
                count = 0;
                chessBoard(0, 0, dr, dc, n);

                for(int[] ii : matrix) {
                    for(int jj : ii) {
                        System.out.printf("%8d", jj);
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void chessBoard(int tr, int tc, int dr, int dc, int size) {
        //如果当前棋盘的尺寸是1,也就是说只有一个方格的时候,返回函数
        if(size ==1) return;
        int curPattern = ++count;
        //把棋盘从中间平均分为4个部分,
        size = size / 2;
        //下面方法分别检索分隔出来的4个部分

        //左上部分
        if(dr < tr + size && dc < tc + size) {
            //如果左上部分包含特殊棋盘，那么就直接递归找左上部分,继续把左上部分分隔
            chessBoard(tr, tc, dr, dr, size);
        } else {
            //如果左上部分不包含特殊棋盘，那么先把左上部分的右下角自定义一个特殊棋盘，然后在递归
            matrix[tr+size-1][tc+size-1] = curPattern;
            chessBoard(tr, tc, tr+size-1, tc+size-1, size);
        }

        //--下面方法都是类似写出
        if(dr < tr + size && dc >= tc + size) {
            chessBoard(tr, tc + size, dr, dc, size);
        } else {
            matrix[tr+size-1][tc+size] = curPattern;
            chessBoard(tr, tc + size, tr+size-1, tc+size, size);
        }

        if(dr >= tr + size && dc < tc + size) {
            chessBoard(tr + size, tc, dr, dc, size);
        } else {
            matrix[tr+size][tc+size-1] = curPattern;
            chessBoard(tr + size, tc, tr+size, tc+size-1, size);
        }

        if(dr >= tr + size && dc >= tc + size) {
            chessBoard(tr + size, tc + size, dr, dc, size);
        } else {
            matrix[tr+size][tc+size] = curPattern;
            chessBoard(tr + size, tc + size, tr+size, tc+size, size);
        }
    }

}