package polymorphism;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>polymorphism<br/>
     * <B>File Name : </B>PolymorphismDemo1<br/>
     * <B>Description</B>
     * <ul> 
     * <li>클래스 다형성1
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 8.
     */

class A1{
	public String x(){return "A.x";}
}

class B1 extends A1{
	public String x() {return "B.x";}
}

class B2 extends A1{
	public String x() {return "B2.x";}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A1 obj = new B1();
			A1 obj2 = new B2();
			System.out.println(obj.x());
			System.out.println(obj2.x());

	}

}
