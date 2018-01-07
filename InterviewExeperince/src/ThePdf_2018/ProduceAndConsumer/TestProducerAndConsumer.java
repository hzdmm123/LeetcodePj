package ThePdf_2018.ProduceAndConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by hzdmm on 2017/12/6.
 */
public class TestProducerAndConsumer {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>(2);
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);
        for (int i=0;i<5;i++){
            new Thread(producer,"Producer"+(i+1)).start();
            new Thread(consumer,"Consumer"+(i+1)).start();
        }
    }
}
