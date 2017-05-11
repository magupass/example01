package polymorphism;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>polymorphism<br/>
     * <B>File Name : </B>PolymorphismDemo2<br/>
     * <B>Description</B>
     * <ul> 
     * <li>인터페이스와 다형성1
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 8.
     */

interface I {}
class C implements I{}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I obj = new C();
	}

}
