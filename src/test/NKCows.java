package test;

import java.util.Scanner;

/**
 * @Author ：Yu
 * @Date ：Created in 20:07 2019/7/17
 * @Description：n头牛 ，逃离k头，计算逃离牛编号之和被n整除的种数，编号0~n-1
 * @Modified By：https://www.nowcoder.com/questionTerminal/2f050f7a6ea7439a84f294f0e16f53a3?source=relative
 *
 * 先用比较直观的做法，用三维数组保存每个状态
 * dp[i][j][s]表示前i只牛选择j头，其和除以n的余数为s的个数
 * 那么状态方程即：
 * 当s>i:
 * dp[i][j][s] = dp[i - 1][j][s] + dp[i - 1][j - 1][s - i];
 * 当s<i:
 * dp[i][j][s] = dp[i - 1][j][s] + dp[i - 1][j - 1][s - i + n];
 * 综合一下
 * 即为：
 * dp[i][j][s] = dp[i - 1][j][s] + dp[i - 1][j - 1][(s - i + n) % n];
 *
 * 这样就能解决这个问题，但是dp数组太大，超过内存限制，因此，使用滚动数组代替
 */
public class NKCows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        final int MOD = 1000000007;

        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(k, i); j >= 1; j--) {
                for (int l = 0; l < n; l++) {
                    dp[j][l] = (dp[j][l] + dp[j - 1][(l + n - (i - 1)) % n]) % MOD;
                }
            }
        }

        System.out.println(dp[k][0]);
    }
}
