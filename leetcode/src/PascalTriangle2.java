import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2016/9/8.
 */
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> answers = new ArrayList<Integer>();

        if (rowIndex==0){
            answers.add(1);
            return  answers;
        }
        if (rowIndex==1){
            answers.add(1);
            answers.add(1);
            return answers;

        }
        if (rowIndex>=2){
            answers.add(1);
            answers.add(1);
        }
        //use one arry to put all numbers. f[x][y] = f[x-1][y] + f[x-1][y-1]
        for (int i=2;i<=rowIndex;i++){
            for (int j=i;j>0;j--){
                if (j==i){
                    answers.add(1);

                }else{
                    answers.set(j,answers.get(j)+answers.get(j-1));
                }

            }

        }

        return answers;
    }
    public static void main(String args[]){
        System.out.println(new PascalTriangle2().getRow(4));
    }
}
