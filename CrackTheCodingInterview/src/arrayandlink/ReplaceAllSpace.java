package arrayandlink;

/**把所有的字符串中的空格用%20替换
 * Created by hzdmm on 2017/3/6.
 */
public class ReplaceAllSpace {
    public static void main(String[] args) {
        String a="we are dog";
        System.out.println(replaceBlank(a.toCharArray(),20));
    }
    /**
     *
     * @param chars
     * @param length字符串的长度包括空格
     * @return
     */
    private static String replaceBlank(char[] chars,int length){
        int spacecount=0;
        int newLength,i;
        for (i=0;i<length;i++){
            if (chars[i]==' '){
                spacecount++;
            }
        }

        newLength = length+spacecount*2;
        chars[newLength]='\0';
        for (i=length-1;i>=0;i--) {
            if (chars[i] == ' ') {
                chars[newLength - 1] = '0';
                chars[newLength - 2] = '2';
                chars[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                chars[newLength - 1] = chars[i];
                newLength = newLength - 1;
            }
        }
        return chars.toString();
    }
}
