package designPattern.singleton;

/**
 * @Author ：Yu
 * @Date ：Created in 14:56 2019/7/29
 * @Description： 懒汉模式 没有考虑线程安全问题
 * @Modified By：
 */
public class SingletonLazy {
    private static SingletonLazy singletonLazyUnSafe;
    private SingletonLazy(){}
    public static synchronized SingletonLazy getInstance(){
        if(null == singletonLazyUnSafe){
            singletonLazyUnSafe = new SingletonLazy();
        }
        return singletonLazyUnSafe;
    }
}
