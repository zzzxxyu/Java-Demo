package designPattern.singleton;

/**
 * @Author ：Yu
 * @Date ：Created in 15:00 2019/7/29
 * @Description： 懒汉式 双重校验锁实现了延迟加载，又解决了线程并发问题，同时还解决了执行效率问题
 * @Problem ：由于指令重排优化的存在，导致初始化Singleton和将对象地址赋给instance字段的顺序是不确定的。
 *             在某个线程创建单例对象时，在构造方法被调用之前，就为该对象分配了内存空间并将对象的字段设置为默认值。此时就可以将分配的内存地址赋值给instance字段了，
 *             然而该对象可能还没有初始化。若紧接着另外一个线程来调用getInstance，取到的就是状态不正确的对象，程序就会出错。
 */
public class SingletonLazyDoubleCheck {
    private static SingletonLazyDoubleCheck singletonLazyDoubleCheck;
    private SingletonLazyDoubleCheck(){}
    public static synchronized SingletonLazyDoubleCheck getInstance(){
        if(null == singletonLazyDoubleCheck){
            synchronized (SingletonLazyDoubleCheck.class){
                if(null == singletonLazyDoubleCheck){
                    singletonLazyDoubleCheck = new SingletonLazyDoubleCheck();
                }
            }
        }
        return singletonLazyDoubleCheck;
    }
}
