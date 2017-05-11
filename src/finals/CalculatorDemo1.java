package finals;
/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>finals<br/>
 * <B>File Name : </B>CalculatorDemo1<br/>
 * <B>Description</B>
 * <ul> 
 * <li>final »ó¼ö
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 10.
 */
import java.awt.geom.PathIterator;

class Calculator {
	static final double PI = 3.14;
	int left, right;
	
	public void setOprands (int left, int right){
		this.left = left;
		this.right = right;
		//Calculator.PI = 6;
	}
	public void sum(){
		System.out.println(this.left + this.right);
	}
	
	public void avg(){
		System.out.println((this.left + this.right)/2);
	}
}
public class CalculatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		//Calculator.PI = 10;
		System.out.println(Calculator.PI);
	}

}
