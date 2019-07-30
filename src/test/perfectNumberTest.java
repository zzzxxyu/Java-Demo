package test;

/**
 * @Author ：Yu
 * @Date ：Created in 13:57 2019/4/2
 * @Description：
 * @Modified By：
 */
public class perfectNumberTest {
    public static int perfectNumberCheck(int n){
        if(n>0){
            int sum = 0;
            if(n==1 || n==2){
                return 1;
            }
            for(int i=1;i<n;i++){
                int temp = n%i;
                if(temp==0){
                    sum+=i;
                }
            }
            if(sum==n){
                return 1;
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }
    public static void main(String arr[]){
        int n =28;
        System.out.println(perfectNumberCheck(n));
    }
}
