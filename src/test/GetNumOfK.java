package test;

/**
 * @Author ：Yu
 * @Date ：Created in 9:25 2019/7/22
 * @Description： 统计一个数字在排序数组中出现的次数。
 * @Modified By：
 */
public class GetNumOfK {
    public static void main(String[] args){
        int[] arr = {1,3,5,5,6};
        int k = 5;
        System.out.println(findNumberOfK(arr,k));
        System.out.println(binSearchNumberOfK(arr,k+0.5) - binSearchNumberOfK(arr,k-0.5));
    }

    //整数
    public static int binSearchNumberOfK(int [] array , double k) {
        int s = 0, e = array.length-1;
        while(s <= e){
            int mid = (e - s)/2 + s;
            if(array[mid] < k)
                s = mid + 1;
            else if(array[mid] > k)
                e = mid - 1;
        }
        return s;
    }

    //非整数
    public static int findNumberOfK(int [] array , int k) {
        if (array.length == 0)  return 0;
        int left = 0;
        int right = array.length -1;
        int index = 0;
        //二分法
        while (left < right){
            int mid = (left + right )/2;
            if (k == array[mid]){
                index = mid;
                break;
            }else if (array[left] < array[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        //遍历查找所有的K
        int count = 0;
        for (int i = index;i >= 0 && array[i]  == k;i --)
            count ++;
        for(int i = index +1; i < array.length && array[i] == k ; i ++)
            count ++;
        return count;
    }
}
