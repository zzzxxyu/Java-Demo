package algorithmDemos;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author ：Yu
 * @Date ：Created in 17:12 2019/8/3
 * @Description：
 * 第一行输入 ： n 表示总共有多少人考试
 * 第二行输入 ：n个分数，以空格隔开
 * 第三行输入 ： q 表示查询几次
 * 第四--输入，表示要查询的
 * 输出q行，每行表示不超过本次要查询的分数的占比 p=(未超过分数的个数-1) / 总共的分数个数 %，输出不用写“%”；
 * 输入：
 * 3
 * 100 98 87
 * 3
 * 1
 * 2
 * 3
 * 输出：
 * 66.666667
 * 33.333333
 * 0.000000
 * @Modified By：
 */
public class SockPartaion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if(n<1) return;
        int[] socks = new int[n];
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if(Integer.parseInt(strs[i]) >150 || Integer.parseInt(strs[i])<0) return;
            socks[i] = Integer.parseInt(strs[i]);
        }
        int q = scanner.nextInt();
        if(q>10000 || q>n) return;
        int[] qs = new int[q];
        for (int i = 0; i < q; i++) {
            qs[i] = scanner.nextInt();
        }
        for (int i = 0; i < qs.length; i++) {
            int temp = socks[i];
            double sol = sol(socks, temp);
            System.out.println(sol);
        }
    }
    private static double sol(int[] socks,int sock){
        int count = 0;
        for (int i = 0; i < socks.length; i++) {
            if(socks[i] < sock){
                count++;
            }
        }
        double s = 0;
        BigDecimal bigDecimal = new BigDecimal((double) (count) / socks.length * 100);
        BigDecimal decimal = bigDecimal.setScale(6, BigDecimal.ROUND_HALF_UP);
        s = decimal.doubleValue();
        return s;
    }

}
