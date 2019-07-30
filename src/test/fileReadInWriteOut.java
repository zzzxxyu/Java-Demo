package test;

import java.io.*;

/**
 * @Author ：Yu
 * @Date ：Created in 14:31 2019/7/18
 * @Description：读、写、处理文件
 * @Modified By：
 */
public class fileReadInWriteOut {

    public static void main(String[] args){
        try {
            String source = "D:\\log.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
            String target = "D:\\error.txt";
            File fileIn = new File(source); // 要读取以上路径的log.txt文件
            File fileOut = new File(target);
            if(!fileOut.exists()){
                fileOut.createNewFile();
            }
            InputStreamReader reader = new InputStreamReader(new FileInputStream(fileIn),"utf-8"); // 建立一个输入流对象reader
            BufferedReader br = new BufferedReader(reader);
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(fileOut), "utf-8");// 建立一个输出流对象reader
            PrintWriter pw = new PrintWriter(writer);
            String str = null;
            while((str = br.readLine()) != null){
                //String line = br.readLine();
                if(str.indexOf("ERROR") != -1){
                    String s = str.replaceFirst("ERROR ","");
                    pw.println(s);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
