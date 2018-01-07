package stringGGGG;

/**
 * Created by hzdmm on 2017/11/27.
 */
public class DetectCapital_520 {
    public boolean detectCapitalUse(String word) {
        int upCaseNum = 0;
        for (char c : word.toCharArray()){
            if (Character.isUpperCase(c)){
                upCaseNum++;
            }
        }

        if (upCaseNum==1) return Character.isUpperCase(word.charAt(0));

        return upCaseNum==0||upCaseNum==word.length();
    }
}
