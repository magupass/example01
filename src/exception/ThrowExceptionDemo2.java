package exception;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ThrowExceptionDemo2<br/>
     * <B>Description</B>
     * <ul> 
     * <li>å�������� throws2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 11.
     */
class B2{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C2{
    void run() throws IOException, FileNotFoundException{
        B2 b = new B2();
        b.run();
    }
}
public class ThrowExceptionDemo2 {
    public static void main(String[] args) {
         C2 c = new C2();
         try {
            c.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt ������ ���� ���� �Դϴ�. �� ������ ������Ʈ ��Ʈ ���丮�� �����ؾ� �մϴ�.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
