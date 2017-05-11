package polymorphism;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>polymorphism<br/>
     * <B>File Name : </B>Workspace<br/>
     * <B>Description</B>
     * <ul> 
     * <li>인터페이스와 다형성 3
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 8.
     */

interface father{}
interface mother{}
interface programmer{
	public void coding ();
}
interface believer{}
class Steve implements father, programmer, believer{
	public void coding (){
		System.out.println("fast");
	}
}

class Rachel implements mother, programmer{
	public void coding(){
		System.out.println("elegance");
	}
}

public class Workspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();
		
		employee1.coding();
		employee2.coding();
	}

}
