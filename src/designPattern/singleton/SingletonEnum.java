package designPattern.singleton;

/**
 * @Author ：Yu
 * @Date ：Created in 15:23 2019/7/29
 * @Description： 单例模式-饿汉模式？ 枚举类  线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用  虽然解决了其他方式存在的问题，现实中很少有人使用
 * @Modified By： https://blog.csdn.net/goodlixueyong/article/details/51935526
 *                 枚举除了线程安全和防止反射调用构造器之外，还提供了自动序列化机制，防止反序列化的时候创建新的对象
 */
public enum SingletonEnum {
    //定义一个枚举的元素，枚举元素本身就是单例，它就代表了Singleton的一个实例
    uniqueInstance;

    //添加自己需要的操作
    public void singletonOperation(){
        System.out.println("功能处理");
    }
}
