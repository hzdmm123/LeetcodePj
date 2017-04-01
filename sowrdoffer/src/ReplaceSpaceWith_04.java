/**
 * Created by hzdmm on 2017/3/9.
 */
public class ReplaceSpaceWith_04 {
    public static String replaceSpace(String str){
        char[] chars= str.toCharArray();
        int m=chars.length;
        int count=0;
        for (int i=0;i<m;i++){
            if (chars[i]==' '){
                count++;
            }
        }
        if (count==0){
            return str;
        }

        int newlength=chars.length+count*2;
        char[] newChar =new char[newlength];
        for (int i=m-1;i>=0;i--){
            if (chars[i]==' '){
                newChar[newlength-1]='0';
                newChar[newlength-2]='2';
                newChar[newlength-3]='%';
                newlength=newlength-3;
            }else {
                newChar[newlength-1]=chars[i];
                newlength=newlength-1;
            }
        }
        return new String(newChar);

    }

    public static void main(String[] args) {
        System.out.print(replaceSpace("hello world"));
    }
}
