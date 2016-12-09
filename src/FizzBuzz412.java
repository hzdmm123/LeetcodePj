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
            StringBuilder zzz = new StringBuilder();
            if (i%3==0){
                zzz.append("Fizz");
            }
            if (i%5==0){
                zzz.append("Buzz");
            }
            zzz.append(Integer.toString(i));
            ls.add(zzz.toString());
        }
        return ls;
    }

}
