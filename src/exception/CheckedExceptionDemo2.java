package exception;

import java.io.*;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>CheckedExceptionDemo2<br/>
     * <B>Description</B>
     * <ul> 
     * <li>예외의 강제2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 10.
     */
public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		/*try{
			String input = bReader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(input);*/
	}
}