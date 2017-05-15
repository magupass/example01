package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ThrowExceptionDemo4<br/>
     * <B>Description</B>
     * <ul> 
     * <li>책임의전가 throws4.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 11.
     */
import java.io.*;
class B4{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C4{
    void run() throws IOException, FileNotFoundException{
        B4 b = new B4();
        b.run();
    }
}
public class ThrowExceptionDemo4 {
    public static void main(String[] args) {
         C4 c = new C4();
         try {
            c.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
