package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>ExceptionDemo3<br/>
     * <B>Description</B>
     * <ul> 
     * <li>다양한 예외3
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 9.
     */

class A3{
	private int [] arr = new int [3];
	A3(){
		arr[0]=0;
		arr[1]= 10;
		arr[2]=20;
	}
	public void z(int first, int second){
		try{
			System.out.println(arr[first]/arr[second]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
	}
}

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a = new A3();
		a.z(10,0);
		a.z(1, 0);
		a.z(2, 1);
	}

}
