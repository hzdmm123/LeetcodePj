package interviewdemostd;

/**
 * Created by hzdmm on 2016/11/21.
 */
public class Example extends Thread {
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("run");
    }
    public static void main(String[] args){
        Example example=new Example();
        example.run();
        System.out.print("main");
    }
}//因为并没有启动一个线程所以只是在客户端延迟1000ms顺序执行
