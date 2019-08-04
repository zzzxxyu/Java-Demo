package algorithmDemos;

/**
 * @Author ：Yu
 * @Date ：Created in 8:14 2019/7/29
 * @Description： 循环左移
 * @Modified By：
 */
public class LeftRotateString {
    public static void main(String[] args){
        String str = "abcXYZdef";
        int n = 3;
        String temp1 = null, temp2 = null;
        if(str.length()>=n){
            temp1 = str.substring(0,n);
            temp2 = str.substring(n , str.length());
        }else{
            int s = str.length()%n;
            temp1 = str.substring(0,s);
            temp2 = str.substring(s , str.length());
        }
        System.out.println(temp2+temp1);//XYZdefabc


        int len = str.length();
        if(len == 0) System.out.println("");
        n = n % len;
        str += str;
        System.out.println(str.substring(n, len+n));//XYZdefabc
    }
}
