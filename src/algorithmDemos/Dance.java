package algorithmDemos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author ：Yu
 * @Date ：Created in 19:19 2019/7/17
 * @Description：给定n 和长度为n的数组，将数组内数链接成环形并使两两之间的差值最小
 * @Modified By：
 */
public class Dance {
    private static int finRes(int n,int[] his){
        Arrays.sort(his);
        int i = n % 2 == 0 ? Math.max(his[(n - 1) / 2 -1], his[(n + 1) / 2 -1]) : his[(n + 1) / 2 - 1];
        int res = his[n-1] - i;
        return res;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int[] his = new int[strings.length];
        for (int i = 0; i < n; i++) {
            if((n>20 || n<3) ||strings.length !=n || Integer.parseInt(strings[i])<80 || Integer.parseInt(strings[i])>140){
                System.out.println("输入不符合条件!");
                return;
            }
            his[i] = Integer.parseInt(strings[i]);
        }
        int res = finRes(n, his);
        System.out.println(res);
    }
}
