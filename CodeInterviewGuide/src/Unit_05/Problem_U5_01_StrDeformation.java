package Unit_05;

/**判断一个字符串是否能组成另外一个字符串
 * Created by hzdmm on 2017/3/7.
 */
public class Problem_U5_01_StrDeformation {
    public boolean isDeformation(String str1,String str2 ){
        if (str1==null||str2==null||str1.length()!=str2.length()){
            return false;
        }

        char[] cha1= str1.toCharArray();
        char[] cha2= str2.toCharArray();
        int[] map=new int[256];
        for (int i=0;i<cha1.length;i++){
            map[cha1[i]]++;
        }
        for (int i=0;i<str2.length();i++){
            if (map[cha2[i]]--==0){
                return false;
            }
        }
        return true;

    }
}
