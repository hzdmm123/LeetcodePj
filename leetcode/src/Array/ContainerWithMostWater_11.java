package Array;

/**
 * Created by hzdmm on 2017/11/6.
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = Math.max(res, Math.min(height[i], height[j]) * (j - i));//记录下当前最大的储水量
            if (height[i] < height[j]) {
                i++;//谁矮不要谁
            } else {
                j--;
            }
        }
        return res;
    }
}
