package reference;

/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>reference<br/>
 * <B>File Name : </B>ReferenceDemo2<br/>
 * <B>Description</B>
 * <ul>
 * <li>참조(2/4):참조란?
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 18.
 */
class A {
	public int id;

	A(int id) {
		this.id = id;
	}
}

public class ReferenceDemo2 {

	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " + a);
	}

	public static void runReference() {
		A a = new A(1);
		A b = a;
		b.id = 2;
		System.out.println("runReference, " + a.id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runValue();
		runReference();
	}

}
