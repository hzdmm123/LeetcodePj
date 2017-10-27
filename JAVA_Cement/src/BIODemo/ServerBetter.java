package BIODemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hzdmm on 2017/10/19.
 */
public final class ServerBetter {
    private static int DEFAULT_PORT=12345;

    private static ServerSocket serverSocket;

    private static ExecutorService executorService = Executors.newFixedThreadPool(60);

    public static void start() throws IOException{
        start(DEFAULT_PORT);
    }

    public synchronized static void start(int port) throws IOException{
        if (serverSocket!=null){
            return;
        }

        try{
            serverSocket = new ServerSocket(port);
            System.out.println("服务器已经启动，端口号："+port);
            while (true){
                Socket socket = serverSocket.accept();
                executorService.execute(new ServerHandler(socket));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (serverSocket!=null){
                System.out.println("关闭服务器");
                serverSocket.close();
                serverSocket=null;
            }
        }
    }
}
