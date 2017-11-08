package Array;

/**
 * Created by hzdmm on 2017/11/6.
 * <p>
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Follow up:
 * Could you do this in-place?
 */
public class rorateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        if (n < 0) {
            return;
        }
        //（i，j）->(j,n-i)
        int[][] r_matrix = new int[n + 1][n + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                r_matrix[j][n - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r_matrix[i][j];
            }
        }
    }
}
