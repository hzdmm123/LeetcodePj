package Proxy.StaticProxy;

/**
 * Created by hzdmm on 2017/10/16.
 */
public class App {
    public static void main(String[] args) {
        IUserDao target = new TargetIUserDao();

        ProxyIUserDao proxyIUserDao = new ProxyIUserDao(target);

        proxyIUserDao.save();
    }
}
