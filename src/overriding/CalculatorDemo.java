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
		System.out.println("�������� " + (this.left + this.right) + "�Դϴ�");
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
		c1.sum();//ȣ���� Ŭ������ �޼ҵ尡 �����Ƿ� �ٷ� ����
		c1.avg();//ȣ���� Ŭ������ �޼ҵ尡 �����Ƿ� ���� Ŭ������ �޼ҵ� ����
		c1.substract();//ȣ���� Ŭ������ �޼ҵ尡 �����Ƿ� �ٷ� ����
	}

}
