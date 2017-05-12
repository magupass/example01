package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ExceptionDemo2<br/>
     * <B>Description</B>
     * <ul> 
     * <li>다양한 예외2
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 9.
     */

class A2{
	private int[] arr = new int [3];
	A2(){
		arr[0]=0;
		arr[1]= 10;
		arr[2]= 20;
	}
	public void z(int first, int second){
		System.out.println(arr[first] / arr[second]);
	}
}

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a = new A2();
		a.z(1, 0);
	}

}
