package tencent;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<num.length();i++){
            list.add(num.substring(i,i+1));
        }
        if(list.size()!=len){
            throw new RuntimeException();
        }
        System.out.println(hashZeroAndOne(list));
    }
    private static int hashZeroAndOne(ArrayList<String> nums){
        if(nums.size()==1){
            return 1;
        }
        for(int i=0,leng=nums.size();i<nums.size()-1;i++){
            if(nums.get(i).equals("0")&&nums.get(i+1).equals("1") || nums.get(i).equals("1")&&nums.get(i+1).equals("0")){
                nums.remove(i);
                if(nums.size()==1){
                    nums.remove(i);
                }else{
                    nums.remove(i+1);
                }
                --leng;
                --leng;
                --i;
                if(i==0){
                    --i;
                }


            }
        }
        return nums.size();
    }
}
