package polymorphism;
/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>polymorphism<br/>
 * <B>File Name : </B>D<br/>
 * <B>Description</B>
 * <ul> 
 * <li>인터페이스와 다형성2
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 8.
 */
interface I2{
	public String A();
}

interface I3{
	public String B();
}

class D implements I2,I3 {
	public String	A(){
		//System.out.println("AAA");
		return "A";
	}
	public String B(){
		//System.out.println("BBB");
		return "B";
	}
}
public class PolymorphismDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj.A();
		obj.B();
		
		objI2.A();
		//objI2.B();
		
		//objI3.A();
		objI3.B();
	}

}
