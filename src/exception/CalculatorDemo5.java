package exception;
/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>exception<br/>
 * <B>File Name : </B>CalculatorDemo5<br/>
 * <B>Description</B>
 * <ul> 
 * <li>���ܸ����2
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 11.
 */
class Calculator5 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		if (this.right == 0) {
			throw new ArithmeticException("0���� ������ ���� ������ �ʽ��ϴ�.");
		}
		try {
			System.out.print("������� ");
			System.out.print(this.left / this.right);
			System.out.print(" �Դϴ�.");
		} catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}


public class CalculatorDemo5 {
	public static void main(String[] args) {
		Calculator5 c1 = new Calculator5();
		c1.setOprands(10, 0);
		c1.divide();
	}
}
