package reference;

/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>reference<br/>
 * <B>File Name : </B>ReferenceParameterDemo<br/>
 * <B>Description</B>
 * <ul>
 * <li>참조(4/4):메소드의 매개변수와 참조, 복제.
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 18.
 */
public class ReferenceParameterDemo {

	static void _value(int b) {
		b = 2;
	}

	public static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue, " + a);
	}

	static void _reference1(A b) {
		b = new A(2);
	}

	public static void runReference1() {
		A a = new A(1);
		_reference1(a);
		System.out.println("runReference1, " + a.id);
	}

	static void _reference2(A b) {
		b.id = 2;
	}

	public static void runReference2() {
		A a = new A(1);
		_reference2(a);
		System.out.println("runReference2, " + a.id);
	}

	public static void main(String[] args) {
		runValue(); // runValue, 1
		runReference1(); // runReference1, 1
		runReference2(); // runReference2, 2
	}

}
