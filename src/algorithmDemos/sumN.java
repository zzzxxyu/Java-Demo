package algorithmDemos;

/**
 * @Author ：Yu
 * @Date ：Created in 8:41 2019/8/4
 * @Description：  求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * @Modified By：
 * 1.需利用逻辑与的短路特性实现递归终止。
 * 2.当n==0时，(n>0)&&((sum+=Sum(n-1))>0)只执行前面的判断，为false，然后直接返回0；
 * 3.当n>0时，执行sum+=Sum(n-1)，实现递归计算Sum(n)。
 */
public class sumN {
    public static void main(String[] args){
        int n1 = 3;
        System.out.println(sum(n1));
    }
    private static int sum(int n){
        int sum = n;
        boolean ans = (n>0)&&((sum+=sum(n-1))>0);
        return sum;
    }
}
