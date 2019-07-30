package test;

/**
 * @Author ：Yu
 * @Date ：Created in 10:08 2019/7/18
 * @Description：二分查找的递归与非递归实现
 * @Modified By：
 */
public class MyBinarySearch {
    //非递归
    private static int noRecu(int[] arr,int key){
        int high = arr.length;
        int low = 0;
        while(low<=high){
            int middle = (high+low)/2;
            if(arr[middle] == key){
                return arr[middle];
            }else if(arr[middle]>key){
                low = middle+1;
            }else{
                high = middle-1;
            }
        }
        return -1;
    }

    //递归
    private static int recu(int[] arr,int high,int low,int key){
        int middle = (high+low)/2;
        if(arr[middle] == key){
            return arr[middle];
        }
        if(low>=high){
            return -1;
        }else if(arr[middle]>key){
            recu(arr,high,middle+1,key);
        }else if(arr[middle]<key){
            recu(arr,middle-1,low,key);
        }
        return -1;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,6,8,9,10,15,20};
        int key = 10;
        int high = arr.length;
        int low = 0;
        int recu = recu(arr, high, low, key);
        int noRecu = noRecu(arr, key);
        System.out.println(recu+"---"+noRecu);
    }
}
