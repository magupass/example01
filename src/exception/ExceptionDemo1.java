package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ExceptionDemo1<br/>
     * <B>Description</B>
     * <ul> 
     * <li>다양한 예외1
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 9.
     */

class A1{
	private int [] arr = new int[3];
	public A1() {
		arr[0]= 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void z (int first, int second){
		System.out.println(arr[first]/arr[second]);
	}
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.z(10,1);
	}

}
