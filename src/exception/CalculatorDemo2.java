package exception;

class Calculator2{
	int left, right;
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	public void divide(){
		try{
			System.out.println("������� ");
			System.out.println(this.left/this.right);
			System.out.println("�Դϴ�");
		}catch(Exception e){
			System.out.println("������ �߻��߽��ϴ� : " + e.getMessage());
		}
	}
}

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>CalculatorDemo2<br/>
     * <B>Description</B>
     * <ul> 
     * <li>����2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 9.
     */
public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 c2 = new Calculator2();
		c2.setOprands(10, 5);
		c2.divide();
	}

}
