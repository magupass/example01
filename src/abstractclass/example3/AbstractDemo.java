package abstractclass.example3;

/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>abstractclass.example3<br/>
 * <B>File Name : </B>AbstractDemo<br/>
 * <B>Description</B>
 * <ul>
 * <li>�߻� �޼ҵ�
 * <li>�������� ������ �и��Ǵ� ��� li �±׸� ����Ͽ� ���� �մϴ�.
 * </ul>
 * 
 * @author magup
 * @since 2017. 4. 26.
 */
abstract class A {
	public abstract int b();

	// ��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
	// public abstract int c() {System.out.println("Hello")}
	// �߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ���� �� �� �ִ�.
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
