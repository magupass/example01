package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ThrowExceptionDemo1<br/>
     * <B>Description</B>
     * <ul> 
     * <li>책임의전가 throws1.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 11.
     */

class B1{
	void run(){
		BufferedReader bReader = null;
		String input = null;
		try{
			bReader = new BufferedReader(new FileReader("out.txt"));
		}catch(FileNotFoundException e ){
			e.printStackTrace();
		}
		try{
			input = bReader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(input);
	}
}
class C1{
	void run(){
		B1 b =new B1();
		b.run();
	}
}

public class ThrowExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		c.run();
	}

}
