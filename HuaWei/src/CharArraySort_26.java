    import java.util.Scanner;

    /**
     * Created by hzdmm on 2017/3/30.
     */
    public class CharArraySort_26 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                StringBuilder sb = new StringBuilder();
                int shift = 'A' - 'a';
                for (int i = 0; i < 26; i++) {
                    char match = (char) ('a' + i);
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(j) == match || str.charAt(j) == (match + shift)) {
                            sb.append(str.charAt(j));
                        }
                    }
                }
                for (int i = 0; i < str.length(); i++) {
                    char m = str.charAt(i);
                    if ((m >= 'A' && m <= 'Z') || (m >= 'a' && m <= 'z')) {
                        continue;
                    } else {
                        sb.insert(i, m);
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
