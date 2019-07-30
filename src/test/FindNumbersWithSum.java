package test;

import java.util.ArrayList;

/**
 * @Author ：Yu
 * @Date ：Created in 9:13 2019/7/28
 * @Description： 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @Modified By：假设a<b  a*b<(a+1)*(b-1) 所以第一次找见的序列就是要找的序列
 */
public class FindNumbersWithSum {
    public static void main(String[] args){
        int[] array = {1,2,3,5,6};
        int sum = 5;
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length < 2) {
            System.out.println(list);
        }
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
                list.add(array[i]);
                list.add(array[j]);
                break;
            }else if(array[i]+array[j]>sum){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(list);
    }
}
