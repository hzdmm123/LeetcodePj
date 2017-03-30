import java.util.Scanner;

/**
 * Created by hzdmm on 2017/3/28.
 */
public class CokeBottle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int blank = sc.nextInt();
            if (blank==0){
               continue;
            }
            int drink=0;
            int remain=0;
            if (blank==1){
                drink=0;
            }else if (blank==2){
                drink=1;
            }else {
                while (blank>2){
                    drink+=blank/3;
                    remain = blank%3;
                    blank = blank/3+remain;
                    if (blank==2){
                        drink++;
                    }
                }
            }
            System.out.println(drink);

        }
    }
}
