package Proxy.JdkProxy;

/**
 * Created by hzdmm on 2017/10/16.
 */
public class targetUserDAo implements UserDao {
    @Override
    public void save() {
        System.out.println("Data保存了");
    }
}
