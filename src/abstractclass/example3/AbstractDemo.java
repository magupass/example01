package abstractclass.example3;

/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>abstractclass.example3<br/>
 * <B>File Name : </B>AbstractDemo<br/>
 * <B>Description</B>
 * <ul>
 * <li>추상 메소드
 * <li>논리적으로 내용이 분리되는 경우 li 태그를 사용하여 개행 합니다.
 * </ul>
 * 
 * @author magup
 * @since 2017. 4. 26.
 */
abstract class A {
	public abstract int b();

	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	// public abstract int c() {System.out.println("Hello")}
	// 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	public void d() {
		System.out.println("world");
	}
}

class B extends A {
	public int b() {
		System.out.println("999");
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.b());
	}
}
