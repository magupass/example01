package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>CalculatorDemo3<br/>
     * <B>Description</B>
     * <ul> 
     * <li>예외3.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 9.
     */


	class Calculator3{
		int left, right;
		public void setOprands(int left, int right){
			this.left = left;
			this.right = right;
		}
		public void divide(){
			try{
				System.out.println("계산결과는 ");
				System.out.println(this.left/this.right);
				System.out.println("입니다. ");
			}catch(Exception e){
				System.out.println("\n\ne.getMessage()\n" + e.getMessage());
				System.out.println("\n\ne.toString()\n"+ e.toString());
				System.out.println("\n\ne.printStackTrace()");
				e.printStackTrace();
			}
		}
	}

public class CalculatorDemo3 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 c1 = new Calculator3();
		c1.setOprands(10, 0);
		c1.divide();
		
	}

}
