import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/31.
 *有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？

 /**
 * 统计出兔子总数。
 *
 * @return 兔子总数




        输入描述:
        输入int型表示month


        输出描述:
        输出兔子总数int型

        输入例子:
        9

        输出例子:
        34
 */
public class Rabit_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            System.out.println(getTotalCount(m));
        }
        sc.close();

    }
    public static int getTotalCount(int monthCount)
    {   int total[] = new int[monthCount];
        if (monthCount==0){
            return 0;
        }else if (monthCount==1||monthCount==2){
            return 1;
        }else {
            //return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
            for (int i=3;i<=monthCount;i++){
                total[monthCount-1]=total[monthCount-2]+total[monthCount-3];
            }
        }
        return total[monthCount-1];
    }

}
