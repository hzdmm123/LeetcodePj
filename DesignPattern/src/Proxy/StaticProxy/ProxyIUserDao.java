package Proxy.StaticProxy;

/**
 * Created by hzdmm on 2017/10/16.
 */
public class ProxyIUserDao implements IUserDao {

    private IUserDao target;

    public ProxyIUserDao(IUserDao target){
        this.target = target;
    }
    public void save() {
        System.out.println("开始事务");
        target.save();
        System.out.println("结束事务");
    }
}
