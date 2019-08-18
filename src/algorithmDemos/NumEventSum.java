package algorithmDemos;

import java.util.Scanner;

/**
 * @Author ：Yu
 * @Date ：Created in 17:16 2019/8/18
 * @Description：对于输入的一个数字，计算它各个位上的数字为偶数的和。
 * @Modified By：
 */
public class NumEventSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum =0;
        while (num > 0){
            int temp = num % 10;
            if(temp%2 == 0){
                sum+=temp;
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
}
