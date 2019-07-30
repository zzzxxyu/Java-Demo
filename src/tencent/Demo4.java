package tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author ：Yu
 * @Date ：Created in 19:37 2019/4/8
 * @Description：
 * @Modified By：
 */
public class Demo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = sc.nextInt();
        sc.close();
        s.replace("[","");
        s.replace("]","");
        String[] sss = new String[s.length()];
        sss = s.split(",");
        System.out.println(test(sss,num));
     }
     private static ArrayList<Integer> test(String[] ss,int num){
        ArrayList<Integer> arr = new ArrayList<>();
        ss[0] = ss[0].substring(1,2);
        ss[ss.length-1] = ss[ss.length-1].substring(0,1);
        for(int i=0;i<ss.length;i++){
            if(Integer.parseInt(ss[i])+num<ss.length){
                for(int j=i+num-1;j>=i;j--){
                    arr.add(Integer.parseInt(ss[j]));
                }
                i = i+num;
            }else{
                arr.add(Integer.parseInt(ss[i]));
            }
        }
        return arr;
     }

}
