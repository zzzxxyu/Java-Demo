package tencent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author ：Yu
 * @Date ：Created in 19:26 2019/4/5
 * @Description：
 * @Modified By：
 */
public class Demo3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(",");
        System.out.println(test(ss));

    }
    private static boolean test(String[] ss){
        boolean flag = false;
        if(ss.length<1){
            return false;
        }
        for(int i = 0;i<ss.length-1;i++){
            for(int j=0;j<ss.length;j++){
                if(ss[i].equals(ss[j])){
                    flag = true;
                }
            }
        }
        return flag;
    }
}
