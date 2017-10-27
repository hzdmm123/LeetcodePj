package Proxy.cglibProxy;

/**
 * Created by hzdmm on 2017/10/16.
 */
public class App {
    public static void main(String[] args) {
        UserDao target  = new UserDao();

        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        proxy.save();
    }
}
