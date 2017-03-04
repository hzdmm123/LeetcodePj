package Unit_04;

/**
 * Created by hzdmm on 2016/10/12.
 */
public class Problem_U4_08_MaxCommonArray2 {
    public String lcts2(String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
            return "";
        }
        char[] chs1 = str1.toCharArray();
        char[] chs2 = str2.toCharArray();

        int row = 0;
        int col = chs2.length - 1;
        int max = 0;
        int end = 0;

        while (row < chs1.length) {
            int i = row;
            int j = col;
            int len = 0;
            while (i < chs1.length && j < chs2.length) {
                if (chs1[i] != chs2[j]) {
                    len = 0;
                } else {
                    len++;
                }
                if (len > max) {
                    end = i;
                    max = len;
                    ;
                }
                i++;
                j++;
            }
            if (col > 0) {
                col--;
            } else {
                row++;
            }

        }
        return str1.substring(end - max + 1, end);

    }
    public static void main(String[] args){
        Problem_U4_08_MaxCommonArray2 pm2 = new Problem_U4_08_MaxCommonArray2();
        String str1 = "adcfghjk";
        String str2 = "abkcfghj";
        System.out.println(pm2.lcts2(str1,str2));
    }
}
