package exception;
/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>exception<br/>
 * <B>File Name : </B>CalculatorDemo1<br/>
 * <B>Description</B>
 * <ul> 
 * <li>예외1
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 9.
 */
class Calculator1{
	int left, right;
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	public void divide(){
		System.out.println("계산결과는 ");
		System.out.println(this.left/this.right);
		System.out.println("입니다.");
	}
}


public class CalculatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1 = new Calculator1();
		c1.setOprands(10, 0);
		c1.divide();
	}

}
