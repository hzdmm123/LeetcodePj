package Proxy.JdkProxy;

/**
 * Created by hzdmm on 2017/10/16.
 */
public class App {
    public static void main(String[] args) {
        UserDao target = new targetUserDAo();

        System.out.println(target.getClass());

        UserDao proxy = (UserDao)new ProxyUserDao(target).getProxyInstance();

        System.out.println(proxy.getClass());
        proxy.save();
    }
}
