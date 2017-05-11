package polymorphism;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>polymorphism<br/>
     * <B>File Name : </B>PolymorphismOverloadingDemo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>overloading과 다형성
     * </ul>
     * 
     * @author magup
     * @since 2017. 4. 28.
     */

class O {
	public void a (int param ){
		System.out.println("숫자출력");
		System.out.println(param+1);
	}
	public void a (String param){
		System.out.println("문자출력");
		System.out.println(param+4);
	}
}


public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O o = new O();
		o.a(1);
		o.a("one");
	}

}
