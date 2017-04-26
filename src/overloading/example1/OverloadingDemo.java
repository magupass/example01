package overloading.example1;
//오버로딩 2
public class OverloadingDemo {

	void A(){System.out.println("void A()");	}
	void A(int arg1){System.out.println("void A Iint arg1)");}
	void A (String arg1){System.out.println("void A (String arg1)");}
	//int A () {System.out.println("void A()");}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("coding everybody");
	}	
}		
	