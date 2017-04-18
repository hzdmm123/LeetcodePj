package test;


import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by hzdmm on 2017/4/7.
 */
public class NumberSort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet set = new TreeSet();
        while (scanner.hasNext()){
            String[] str = scanner.nextLine().split(",");
            String a = str[0];
            String b = str[1];
            String c = str[2];
            int max=0;
            for (int i=0;i<3;i++){
                if (Integer.parseInt(str[i])>max){
                    max=Integer.parseInt(str[i]);
                }
            }
            for (int i=0;i<str.length;i++){
                set.add(Integer.parseInt(str[i]));
            }
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    for (int k=0;k<3;k++){
                        if (i==j||j==k||i==k){
                            continue;
                        }
                        set.add(Integer.parseInt(str[i]+str[j]+str[k]));
                    }
                }
            }
            System.out.println((int)set.toArray()[max-1]);

        }
    }
    public static String change(String s){
        if (s.equals("5")){
            return "2";
        }
        if (s.equals("2")){
            return "5";
        }
        if (s.equals()=='6'){

        }
    }
}
