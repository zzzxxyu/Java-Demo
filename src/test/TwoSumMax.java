package test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * @Author ：Yu
 * @Date ：Created in 17:11 2019/7/16
 * @Description：
 * @Modified By：
 */
public class TwoSumMax {
    private static String finNum(int[] nums,int sum){
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int diff = sum - nums[i];
            if(diff>0){
                int index = Arrays.binarySearch(nums, diff);
                if(index>0){
                    return nums[i]+"-"+nums[index];
                }
            }
        }
        return "无符合条件数据！";
    }
    private static String finNumByTwoFor(int[] nums,int sum){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == sum){
                    return nums[i]+"-"+nums[j];
                }
            }
        }
        return "无符合条件数据！";
    }

    public static void main (String[] args){
        int[] nums = {2,4,5,7,8,10,11,12,13,14,15,20,22,25,28,30};
        int sum = 58;
        long stopTime1 = fromDateStringToLong(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS").format(new Date()));
        String y = finNum(nums,sum);
        long startTime1 =fromDateStringToLong(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS").format(new Date()));
        System.out.println("方法一： "+y+"  耗时： "+(startTime1 - stopTime1));

        stopTime1 = fromDateStringToLong(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS").format(new Date()));
        y = finNumByTwoFor(nums,sum);
        startTime1 =fromDateStringToLong(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS").format(new Date()));
        System.out.println("方法二： "+y+"  耗时： "+(startTime1 - stopTime1));

    }

    public static long fromDateStringToLong(String inVal) {
        Date date = null;
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        try {
            date = inputFormat.parse(inVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date.getTime();
    }
}
