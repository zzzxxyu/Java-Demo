package algorithmDemos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author ：Yu
 * @Date ：Created in 9:32 2019/4/19
 * @Description：给定数组和K,输出小于k的所有数（从小到大？）
 * @Modified By：快排，nlog(n)
 */
public class MinK {
    public static void main(String[] args){
        int[] a = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(a,10));
    }
    private static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
        ArrayList<Integer> result = new ArrayList<>();
        if(input==null || input.length<k || k<1){
            return result;
        }
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return result;
        /*Arrays.sort(input);
        ArrayList<Integer> result = new ArrayList<>();
        if(input.length<k){
            for(int i : input){
                result.add(i);
            }
            return result;
        }
        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return result;*/
    }
}
