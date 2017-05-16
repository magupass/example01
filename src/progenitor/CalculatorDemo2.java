package progenitor;
/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>progenitor<br/>
 * <B>File Name : </B>CalculatorDemo2<br/>
 * <B>Description</B>
 * <ul> 
 * <li>Object class : toString È°¿ë.
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 13.
 */
class Calculator2 {
	int left, right;
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	public void sum(){
		System.out.println(this.left+this.right);
	}
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
	public String toString(){
		System.out.println(this.left);
		System.out.println(this.right);
		return "left : " + this.left + ", right : " + this.right;
		
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		System.out.println(c1);
		//System.out.println(c1.toString());
		//c1.sum();
		//c1.avg();
	}

}
