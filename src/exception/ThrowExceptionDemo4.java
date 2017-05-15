package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ThrowExceptionDemo4<br/>
     * <B>Description</B>
     * <ul> 
     * <li>å�������� throws4.
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
            System.out.println("out.txt ������ ���� ���� �Դϴ�. �� ������ ������Ʈ ��Ʈ ���丮�� �����ؾ� �մϴ�.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
