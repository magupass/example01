package interfaces.example2;
/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>interfaces.example2<br/>
 * <B>File Name : </B>CalculatorConsumer<br/>
 * <B>Description</B>
 * <ul> 
 * <li>�������̽� ����.
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 10.
 */
class Calculator implements Calculatable {
	int first, second, third;
	
	public void setOprands(int first, int second, int third){
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public int sum(){
		return this.first + this.second + this.third;
	}
	
	public int avg(){
		return (this.first + this.second + this.third)/3;
	}
}

public class CalculatorConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}

}
