package test;

/**
 * @Author ：Yu
 * @Date ：Created in 9:52 2019/7/11
 * @Description：数组内除了一个元素外其他两两相等，求那个元素
 * @Modified By：
 */
public class Find1From2 {


    public static void main(String[] args){
        int[] a= {1,2,2,3,1};
        int i = find1From2(a);
        System.out.println(i);
    }
    public static int find1From2(int[] a){
        int len = a.length, res = 0;
        for(int i = 0; i < len; i++){
            res= res ^ a[i];
        }
        return res;
    }
    StringBuffer s = new StringBuffer("ss");
    StringBuilder sb = new StringBuilder("sssss");

}
