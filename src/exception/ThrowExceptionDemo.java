package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ThrowExceptionDemo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>예외사슬.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 10.
     */

class B{
	void run(){
		
	}
}
class C{
	void run(){
		B b = new B();
		b.run();
		
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.run();
	}

}
