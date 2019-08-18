package algorithmDemos;

import java.util.Scanner;

/**
 * @Author ：Yu
 * @Date ：Created in 15:22 2019/8/18
 * @Description：判断自然数是否为质数/素数
 * @Modified By：
 * （1）从2开始，2是最小的质数。
 *
 * （2）2之外的偶数都不是质数，因为除了1和自身之外它们还能被2整除。若为大于2的奇数，则进入下一步继续判断。
 *
 * （3）将其开方，若从3到开方向下取整之间的所有奇数都不能将其整除，则说明该数为质数。
 */
public class IsPrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num == 2){
            System.out.println(true);
            return;
        }
        if(num < 2 || num%2==0){
            System.out.println(false);
            return;
        }
        for (int i = 3; i < Math.sqrt(num); i+=2) {
            if(num%i == 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
