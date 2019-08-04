package algorithmDemos;

import java.util.Arrays;

/**
 * @Author ：Yu
 * @Date ：Created in 10:32 2019/7/31
 * @Description： 扑克牌顺子
 * @Modified By：大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13，数组中大小王是0，组成顺子就输出true，否则就输出false
 */
public class IsContinuous {
    public static void main(String[] args){
        int[] numbers = {1,3,0,0,5};
        int length = numbers.length;
        int kings = 0;
        int numOfInterval = 0;
        if(length == 0){
            System.out.println(false);
            return;
        }
        Arrays.sort(numbers);
        for(int i = 0;i < length - 1;i++){
            if(numbers[i] == 0){
                kings++;
                continue;
            }
            // 对子，直接返回
            if(numbers[i] == numbers[i+1]){
                System.out.println(false);
                return;
            }
            //此处是计算两两差值间隙的和：例如0，0，1，3，5，3-1-1=1，5-3-1=1，1+1=2=kings
            numOfInterval += numbers[i + 1] - numbers[i] - 1;
        }
        //如果0的个数大于等于差值数则为true,大于是除了0其他已经是顺子的情况
        if (kings >= numOfInterval) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
