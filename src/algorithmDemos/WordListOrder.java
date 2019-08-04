package algorithmDemos;

/**
 * @Author ：Yu
 * @Date ：Created in 13:00 2019/4/2
 * @Description：
 * @Modified By：
 */
public class WordListOrder {
    public static int canArrangeWords(String arr[]){
        int flag = 1;
        int a = arr.length;
        if(a<2||a>100){
            return -1;
        }
        for(int i=0;i<a-1;i++){
            if(arr[i].length()>1){
                if(!arr[i].substring(arr[i].length()-1,arr[i].length()).equals(arr[i+1].substring(0,1))){
                    flag = -1;
                }
            }
        }
        return flag;

    }

    public static void main(String arr[]){
        String [] str = {"gj","jdgsgsl","dg","gd","dg"};
        System.out.println(canArrangeWords(str));
    }
}
