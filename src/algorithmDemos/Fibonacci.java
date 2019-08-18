package algorithmDemos;

import java.util.Scanner;

/**
 * @Author ：Yu
 * @Date ：Created in 15:55 2019/8/18
 * @Description：fibonacci跳台阶
 * @Modified By：某人上楼梯，他一步可以迈一个台阶，两个台阶或三个台阶，共有n个台阶，编程输出他所有可能上法。
 * https://www.nowcoder.com/questionTerminal/aa12b1ec8192454cad9e02cadbabc0ba
 */
public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long count = getCount(n);
        System.out.println(count);
    }
    public static long getCount(int n){
        if(n<4){
            return n;
        }
        int f1=1,f2=2,f3=3;
        int fn = 0;
        for (int i = 4; i <= n ; i++) {
            fn = f1+f2+f3;
            f1=f2;
            f2=f3;
            f3=fn;
        }
        return fn;
    }
}
