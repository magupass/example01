package exception;
/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>exception<br/>
 * <B>File Name : </B>CalculatorDemo4<br/>
 * <B>Description</B>
 * <ul> 
 * <li>���ܸ����1
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 11.
 */

class Calculator4{
	int left , right;
	public void setOprands(int left,int right){
		if(right ==0){
			throw new IllegalArgumentException("�ι�° ������ ���� 0�� �� �� �����ϴ�.");
		}
		this.left = left;
		this.right = right;
	}
	public void divide(){
		try {
			System.out.println("������� ");
			System.out.println("this.left/this.right");
			System.out.println("�Դϴ�");
		}catch (Exception e){
			System.out.println("\n\ne.getMessage()n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}
	

public class CalculatorDemo4 {

	public static void main(String[] args) {
		Calculator4 c1 = new Calculator4();
		c1.setOprands(10, 0);
		c1.divide();

	}

}
