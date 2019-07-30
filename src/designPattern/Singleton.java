package designPattern;

/**
 * @Author ：Yu
 * @Date ：Created in 14:39 2019/7/29
 * @Description： 饿汉式(线程安全，调用效率高，但是不能延时加载)
 * @Modified By：
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    //将构造器设置为private禁止通过new进行实例化
    private Singleton(){}
    public static Singleton getSingleton(){
        return singleton;
    }
}
