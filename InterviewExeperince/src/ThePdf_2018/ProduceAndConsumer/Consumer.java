package ThePdf_2018.ProduceAndConsumer;

import java.util.concurrent.BlockingQueue;

/**
 * Created by hzdmm on 2017/12/6.
 */
public class Consumer implements Runnable{
    BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            String temp = queue.take();
            System.out.println("消费了"+temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
