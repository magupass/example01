package overriding;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Calculator{
	int left, right;
	
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left + this.right+"a");
	}
	
    public int avg() {
    	System.out.println((this.left + this.right) / 2);
    	return ((this.left + this.right) / 2);
    }
}

class SubstractionalbeCalculator extends Calculator {
	public void sum(){
		System.out.println("실행결과는 " + (this.left + this.right) + "입니다");
	}
	
    //public int avg() {
        //return ((this.left + this.right) / 2);
    	//return super.avg();
    //}
	
	
	public void substract(){
		System.out.println(this.left - this.right+"c");
	}
}


public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionalbeCalculator c1 = new SubstractionalbeCalculator();
		c1.setOprands(10, 2);
		c1.sum();//호출한 클래스에 메소드가 있으므로 바로 실행
		c1.avg();//호출한 클래스에 메소드가 없으므로 상위 클래스의 메소드 실행
		c1.substract();//호출한 클래스에 메소드가 있으므로 바로 실행
	}

}
