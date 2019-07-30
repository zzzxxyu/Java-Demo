package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author ：Yu
 * @Date ：Created in 16:29 2019/4/1
 * @Description：
 * @Modified By：JDK代理
 */
public class DynamicProxyHander implements InvocationHandler {

    private Object target;

    public DynamicProxyHander(Object target){
        this.target = target;
    }
    public <T> T getProxy(){
        System.out.println("this is " + this);
        System.out.println("Interface is " + Arrays.asList(target.getClass().getInterfaces()));
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知");
        Object result = method.invoke(target,args);
        System.out.println("后置通知");
        return result;
    }
}
