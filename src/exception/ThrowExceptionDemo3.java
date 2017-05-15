package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ThrowExceptionDemo3<br/>
     * <B>Description</B>
     * <ul> 
     * <li>책임의전가 throws3.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 11.
     */
import java.io.*;
class B3{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C3{
    void run(){
        B3 b = new B3();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class ThrowExceptionDemo3 {
    public static void main(String[] args) {
         C3 c = new C3();
         c.run();
    }   
}
