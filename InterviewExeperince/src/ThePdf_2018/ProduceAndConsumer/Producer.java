package ThePdf_2018.ProduceAndConsumer;

import java.util.concurrent.BlockingQueue;

/**
 * Created by hzdmm on 2017/12/6.
 */
public class Producer implements Runnable{
    BlockingQueue queue ;

    public Producer(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String temp = "A product由生产线程:"+Thread.currentThread().getName();
            System.out.println("i have a product:"+Thread.currentThread().getName());
            queue.put(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

