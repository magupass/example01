package abstractclass.example3;

/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>abstractclass.example3<br/>
 * <B>File Name : </B>CalculatorDemo<br/>
 * <B>Description</B>
 * <ul>
 * <li>추상클래스 적용하여 계산
 * </ul>
 * 
 * @author magup
 * @since 2017. 4. 26.
 */

abstract class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ sum :" + (this.left + this.right));
	}

	public void avg() {
		System.out.println("+avg :" + (this.left + this.right) / 2);
	}
}

class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum : " + (this.left + this.right));
	}

	public void avg() {
		System.out.println("- avg :" + (this.left + this.right) / 2);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();

		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}
}
