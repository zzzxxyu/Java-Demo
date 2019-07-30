package test;

/**
 * @Author ：Yu
 * @Date ：Created in 8:41 2019/7/30
 * @Description： 翻转单词顺序
 * @Modified By：
 */
public class ReverseString {
    public static void main(String[] args){
        String str = "student. a am I";
        String[] temp = str.split(" ");
        StringBuffer res = new StringBuffer("");
        for(int i=temp.length-1; i>=0;i--){
            res.append(temp[i] + " ");
        }
        System.out.println(res.toString().substring(0,res.length()-1));
    }
}
