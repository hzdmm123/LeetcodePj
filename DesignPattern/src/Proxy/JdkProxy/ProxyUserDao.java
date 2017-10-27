package Proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by hzdmm on 2017/10/16.
 */
public class ProxyUserDao {
    private Object target;
    public  ProxyUserDao(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始事务");
                Object returnValue = method.invoke(target,args);//生成代理对象
                System.out.println("提交事务");
                return returnValue;
            }
        });
    }
}
