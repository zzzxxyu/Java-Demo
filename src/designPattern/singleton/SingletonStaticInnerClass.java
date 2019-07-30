package designPattern.singleton;

/**
 * @Author ：Yu
 * @Date ：Created in 15:13 2019/7/29
 * @Description： 单例模式-静态内部类 利用了类加载机制来保证只创建一个instance实例,这种方式可以同时保证延迟加载和线程安全。 建议使用
 * @Modified By：在遇见序列化和反序列化的场景，得到的不是同一个实例 ，解决这个问题是在序列化的时候使用readResolve方法
 *                https://blog.csdn.net/u014672511/article/details/79774847
 */
public class SingletonStaticInnerClass {
    private static class SingletonHoler {
        public static SingletonStaticInnerClass singletonStaticInnerClass = new SingletonStaticInnerClass();
    }
    private SingletonStaticInnerClass(){}
    public static SingletonStaticInnerClass getInstance(){
        return SingletonHoler .singletonStaticInnerClass;
    }
}
