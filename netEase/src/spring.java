import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/25.
 */
public class spring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] px = new int[n];
            int[] py = new int[n];
            for (int i = 0; i <= n; i++) {
                px[i] = in.nextInt();
            }

            for (int i = 0; i <= n; i++) {
                py[i] = in.nextInt();
            }

            int gx = in.nextInt();
            int gy = in.nextInt();

            double walkTime = in.nextDouble();
            double taxTime = in.nextDouble();
            double minTime = walkTime*(Math.abs(gx)+Math.abs(gy));
            for (int i = 0; i <= n; i++){
                double time=walkTime*(Math.abs(px[i])+Math.abs(py[i]))+taxTime*(Math.abs(gx-px[i])+Math.abs(gy-py[i]));
                if (time<minTime){
                    minTime=time;
                }
            }
            System.out.println(minTime);
        }
    }
}
