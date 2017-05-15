package exception;

import java.io.*;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>CheckedExceptionDemo3<br/>
     * <B>Description</B>
     * <ul> 
     * <li>예외의 강제3.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 10.
     */
public class CheckedExceptionDemo3 {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        System.out.println(input); 
    }
}
