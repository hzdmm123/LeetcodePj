package Proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/**
 * Created by hzdmm on 2017/10/16.
 */
public class ProxyFactory implements MethodInterceptor{
    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer en = new Enhancer();

        en.setSuperclass(target.getClass());

        en.setCallback(this);

        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务");
        Object returnValue = method.invoke(target,objects);

        System.out.println("提交事务");
        return returnValue;
    }
}
