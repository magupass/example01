package accessmodifier;
//접근제어자를 사용하여 계산기능 수정
class Calculator{
	private int left, right;
	
	public void setPorands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	private int _sum(){
		return this.left+this.right;
	}
	
	public void sumDecoPlus(){
		System.out.println("++++"+_sum()+"++++");
	}
	
	public void sumDecoMinus(){
		System.out.println("----"+_sum()+"----");
	}
	
	
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setPorands(10, 20);
		c1.sumDecoPlus();
		c1.sumDecoMinus();
	}

}
