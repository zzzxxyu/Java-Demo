package algorithmDemos.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @Author ：Yu
 * @Date ：Created in 12:58 2019/7/21
 * @Description： BIO同步阻塞 客户端
 * @Modified By：
 */
public class IOClient {
     public static void main(String[] args){
         new Thread(() -> {
             try {
                 Socket socket = new Socket("127.0.0.1", 3333);
                 while (true) {
                     try {
                         socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                         socket.getOutputStream().flush();
                         Thread.sleep(2000);
                     } catch (Exception e) {
                     }
                 }
             } catch (IOException e) {

             }
         }).start();
     }
}
