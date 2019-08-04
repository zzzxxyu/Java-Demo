package algorithmDemos;

/**
 * @Author ：Yu
 * @Date ：Created in 19:16 2019/7/6
 * @Description：
 * @Modified By：
 */
public class Test {
    private int j;

    public static void main(String args[]){
        Test tt=new Test();
        /*int[] array= {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        System.out.println(array.length);
        int count = 0;
        int len = array.length;
        for(int i=len-1;i>=0;i--){
            for(int j = 0;j<len;j++){
                if(j < i && array[j] > array[i]){
                    count++;
                }
            }
        }
        System.out.println(count%1000000007);*/
        Inc inc=tt.new Inc();
        Dec dec=tt.new Dec();
        for(int i=0;i<2;i++){
            Thread t=new Thread(inc);
            t.start();
            t=new Thread(dec);
            t.start();
        }
    }
    private synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc:"+j);
    }
    private synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec:"+j);
    }
    class Inc implements Runnable{
        public void run(){
            for(int i=0;i<100;i++){
                inc();
            }
        }
    }
    class Dec implements Runnable{
        public void run(){
            for(int i=0;i<100;i++){
                dec();
            }
        }
    }
}
