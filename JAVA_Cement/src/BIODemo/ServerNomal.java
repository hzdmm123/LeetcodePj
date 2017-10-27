package BIODemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by hzdmm on 2017/10/18.
 */
public final class ServerNomal {
    //端口号
    private static int default_port=12345;
    //单例的socket服务
    private static ServerSocket server;

    public static void start() throws IOException{
        start(default_port);
    }

    public synchronized static void start(int port) throws IOException{
        if (server!=null){
            return;
        }
        try{
            server = new ServerSocket(port);
            System.out.println("服务器已启动：端口号"+port);

            while (true){
                Socket socket = server.accept();//监听

                new Thread(new ServerHandler(socket)).start();
            }
        }finally {
            if (server!=null){
                System.out.println("服务器已经关闭。");
                server.close();
                server=null;
            }
        }

    }


}
