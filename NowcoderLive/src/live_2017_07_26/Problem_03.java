package live_2017_07_26;

/**
 * Created by hzdmm on 2017/7/29.
 *
 *
 1、已知一个字符串都是由左括号(和右括号)组成，判断该字符串是否是有效的括号组合。

 例子：
 有效的括号组合:()(),(()),(()())
 无效的括号组合:(,()),((),()(()
 */
public class Problem_03 {
  public static int maxsSum(int[] arr){
      if (arr==null||arr.length==0){
          return 0;
      }
      int sum = 0;
      int current = 0;
      for(int i=0;i<arr.length;i++){
          current+=arr[i];

          sum=Math.max(current,sum);
          if (current<0){
              current=0;
              continue;
          }


      }
      return sum;
  }


    public static void main(String[] args) {
        int[] arr ={-2, -3, -5, 40, -10, -10, 100, 1};
        System.out.println(maxsSum(arr));
    }
}
