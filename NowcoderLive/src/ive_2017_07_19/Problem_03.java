package ive_2017_07_19;

/**
 * Created by hzdmm on 2017/7/19.
 * 有一排正数，玩家A和玩家B都可以看到。
 每位玩家在拿走数字的时候，都只能从最左和最右的数中选择一个。
 玩家A先拿，玩家B再拿，两人交替拿走所有的数字，
 两人都力争自己拿到的数的总和比对方多。请返回最后获胜者的分数。

 例如：
 5,2,3,4
 玩家A先拿，当前他只能拿走5或者4。
 如果玩家A拿走5，那么剩下2，3，4。轮到玩家B，此时玩家B可以选择2或4中的一个，…
 如果玩家A拿走4，那么剩下5，2，3。轮到玩家B，此时玩家B可以选择5或3中的一个，…

 */
public class Problem_03 {
    public static int win1(int[] array){
        if (array==null||array.length<1){
            return 0;
        }
        return Math.max(f(array,0,array.length-1),s(array,0,array.length-1));
    }

    private static int f(int[] array, int i, int j) {
        if (i==j){
            return array[i];//先拿的拿最后一个
        }
        return Math.max(array[i]+s(array,i+1,j),array[j]+s(array,i,j-1));
    }

    private static int s(int[] array, int i, int j) {
        if (i==j){
            return 0;//表示没有可以拿的，第一个需要被拿走
        }
        //表示后拿的那个人的是先拿的那个人留下的最少的
        return Math.min(f(array, i + 1, j), f(array, i, j - 1));
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        a[0]=0;
        a[1]=1;
        a[2]=0;
        System.out.println(win1(a));
        System.out.println(win2(a));
        System.out.println(win3(a));

    }

    public static int win2(int[] arr){
        if(arr==null||arr.length<0){
            return 0;
        }
         int[][] f = new int[arr.length][arr.length];
         int[][] s = new int[arr.length][arr.length];
         for(int j=0;j<arr.length;j++){
            f[j][j]=arr[j];
            for (int i=j-1;i>=0;i--){
                f[i][j] = Math.max(arr[i]+s[i+1][j],arr[j]+s[i][j-1]);
                s[i][j] = Math.min(f[i+1][j],f[i][j-1]);
            }
         }
        return Math.max(f[0][arr.length-1],s[0][arr.length-1]);
    }


    public static int win3(int[] arr){
        if (arr==null||arr.length<1){
            return 0;
        }
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int score = p(arr,0,arr.length-1);
        return Math.max(sum-score,score);
    }

    private static int p(int[] arr, int i, int j) {
        if (i==j){
            return arr[i];
        }
        if (i+1==j){
            return Math.max(arr[i],arr[j]);
        }
        return Math.max(arr[i]+Math.min(p(arr,i+2,j),p(arr,i-1,j-1)),
                arr[j]+Math.min(p(arr,i+1,j-1),p(arr,i,j-2)));
    }

}
