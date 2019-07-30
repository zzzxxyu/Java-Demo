package designPattern.singleton;

/**
 * @Author ：Yu
 * @Date ：Created in 15:07 2019/7/29
 * @Description： 单例懒加载 双重检查锁+volatile。 建议使用
 * @Modified By：volatile的一个语义是禁止指令重排序优化，也就保证了instance变量被赋值的时候对象已经是初始化过的
 */
public class SingletonLazyVolatile {
    private static volatile SingletonLazyVolatile singletonLazyVolatile;
    private SingletonLazyVolatile(){}
    public static synchronized SingletonLazyVolatile getInstance(){
        if(null == singletonLazyVolatile){
            synchronized(SingletonLazyVolatile.class){
                if(null == singletonLazyVolatile){
                    singletonLazyVolatile = new SingletonLazyVolatile();
                }
            }
        }
        return singletonLazyVolatile;
    }
}
