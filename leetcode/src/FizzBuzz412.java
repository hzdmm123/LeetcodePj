import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzdmm on 2016/12/8.
 */
public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        if (n<0){
            return null;
        }
        List<String> ls = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if (i%3==0&&i%5==0){
                ls.add("FizzBuzz");
            }else if(i%3==0){
                ls.add("Fizz");
            }else if (i%5==0){
                ls.add("Buzzz");
            }
            ls.add(String.valueOf(i));
        }
        return ls;
    }

}
