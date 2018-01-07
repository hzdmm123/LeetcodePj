package swordoffer.P_2017_11_30;

/**
 * Created by hzdmm on 2017/11/30.
 */
public class replaceSpace_2 {
    public String replaceSpace(StringBuffer str){
        char[] chars  = str.toString().toCharArray();
        int m = chars.length;
        int count = 0;
        for (int i=0;i<m;i++){
            if (chars[i]==' '){
                count++;
            }
        }

        if (count==0){
            return str.toString();
        }

        int  newLength = m + 2 * count;
        char[] newChar = new char[newLength];
        for (int i=m-1;i>=0;i--){
            if (chars[i]==' '){
                newChar[newLength-1]='0';
                newChar[newLength-2]='2';
                newChar[newLength-3]='%';
                newLength = newLength-3;
            }else {
                newChar[newLength-1]= chars[i];
                newLength = newLength-1;
            }
        }
        return new String(newChar);
    }
}
