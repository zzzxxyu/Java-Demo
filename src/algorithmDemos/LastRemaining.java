package algorithmDemos;

/**
 * @Author ：Yu
 * @Date ：Created in 11:19 2019/8/3
 * @Description： 随机指定一个数m,让编号为0的小朋友开始报数。
 *                  每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....
 *                  这样下去....直到剩下最后一个小朋友。编号是从0到n-1
 * @Modified By：https://www.nowcoder.com/questionTerminal/11b018d042444d4d9ca4914c7b84a968
 */
public class LastRemaining {
    public static void main(String[] args){
        int n = 6, m = 4;
        int res = recu(n, m);
        System.out.println(res);


        if(n==0||m==0) System.out.println(-1);
        int s=0;
        for(int i=2;i<=n;i++)
        {
            s=(s+m)%i;
        }
        System.out.println(s);

    }
    private static int recu(int n,int m){
        if(n==0||m==0)return -1;
        if(n==1)
            return 0;
        else
            return (recu(n-1,m)+m)%n;
    }
}
