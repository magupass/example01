package generic;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>generic<br/>
     * <B>File Name : </B>GenericDemo1<br/>
     * <B>Description</B>
     * <ul> 
     * <li>제네릭(1/5):제네릭의 사용.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 18.
     */

class Person<T>{
	public T info;
}
public class GenericDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person<String> p1 = new Person<String>();
		Person<StringBuilder> p2 = new Person<StringBuilder>();
	}

}
