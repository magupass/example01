package exception;

class Calculator2{
	int left, right;
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	public void divide(){
		try{
			System.out.println("계산결과는 ");
			System.out.println(this.left/this.right);
			System.out.println("입니다");
		}catch(Exception e){
			System.out.println("오류가 발생했습니다 : " + e.getMessage());
		}
	}
}

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>CalculatorDemo2<br/>
     * <B>Description</B>
     * <ul> 
     * <li>예외2.
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
