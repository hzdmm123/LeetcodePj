package Proxy.StaticProxy;

/**
 * Created by hzdmm on 2017/10/16.
 */
public class TargetIUserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("Data保存了");
    }
}
