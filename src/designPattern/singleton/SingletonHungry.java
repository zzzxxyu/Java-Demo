package designPattern.singleton;

/**
 * @Author ：Yu
 * @Date ：Created in 14:39 2019/7/29
 * @Description： 饿汉式(线程安全，调用效率高，但是不能延时加载)
 * @Modified By： https://blog.csdn.net/goodlixueyong/article/details/51935526
 */
public class SingletonHungry {
    private static SingletonHungry singleton = new SingletonHungry();
    //将构造器设置为private禁止通过new进行实例化
    private SingletonHungry(){}
    public static SingletonHungry getSingleton(){
        return singleton;
    }
}
