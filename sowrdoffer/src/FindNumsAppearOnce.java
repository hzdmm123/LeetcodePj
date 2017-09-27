import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by hzdmm on 2017/4/13.
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashSet<Integer> set = new LinkedHashSet();
        for (int i=0;i<array.length;i++){
            if (set.contains(array[i])){
                set.remove(array[i]);
            }else {
                set.add(array[i]);
            }
        }
        num1[0] = (Integer)set.toArray()[0];
        num2[0] =(Integer)set.toArray()[1];
    }
    //异或的揭发
    public void find(int[] array,int[] num1,int[] num2){
        int result=0;
        for (int i=0;i<array.length;i++){
            result^=array[i];//已获出来的result代表的是那两个异或出来的值
        }
        int count=0;
        for (;count<array.length;count++){
            if ((result&(1<<count))!=0){
                break;//找到异或的标志位
            }
        }

        num1[0]=0;
        num2[0]=0;
        for (int i=0;i<array.length;i++){
            if ((array[i]&(1<<count))==0){
                num1[0]^=array[i];
            }else {
                num2[0]^=array[i];
            }
        }
    }
}
