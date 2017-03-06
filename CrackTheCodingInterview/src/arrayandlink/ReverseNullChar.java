package arrayandlink;

/**
 * Created by hzdmm on 2017/3/6.
 */
public class ReverseNullChar {
    public static String ReverseChar(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseNullChar.ReverseChar("hdiahjkdjhdjka"));
    }


}
