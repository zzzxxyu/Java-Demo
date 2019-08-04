package algorithmDemos;

import java.util.HashMap;

/**
 * @Author ：Yu
 * @Date ：Created in 13:04 2019/3/30
 * @Description：
 * @Modified By：
 */
public class HelloWord {
    public static void main(String[] args){
        int count=0;
        int num=0;
        /*for(int i=0;i<=100;i++){
            num=num+i;
            count=count++;
            System.out.println(count+"<--");
        }
        System.out.println(num*count);*/
        for(int i=0;i<4;i++){
            num=num++;
        }
        HashMap hashMap= new HashMap();
        //ThreadLocal<> threadLocal = new ThreadLocal<>();
        //ThreadPool threadPool= new ThreadPool();
        //ConcurrentHashMap;
        System.out.println(num);
    }
}
