package generic;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>generic<br/>
     * <B>File Name : </B>GenericDemo8<br/>
     * <B>Description</B>
     * <ul> 
     * <li>제네릭(5/5):제네릭의 제한2-1.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 19.
     */
abstract class Info{
	public abstract int getLevel();
}
class EmployeeInfo6 extends Info{
	public int rank;
	EmployeeInfo6(int rank){this.rank = rank;}
	public int getLevel(){
		return this.rank;
	}
}
class Person6<T extends Info>{
	public T info;
	Person6(T info){this.info = info;}
}
public class GenericDemo8 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p1 = new Person6(new EmployeeInfo6(1));
		//Person6<String> p2 = new Person6<String>("부장");
		
	}

}
