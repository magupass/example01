package inheritance.example1;

class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println((this.left * this.right)+"c");
    }
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
	}

}
