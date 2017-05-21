package generic;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>generic<br/>
     * <B>File Name : </B>GenericDemo6<br/>
     * <B>Description</B>
     * <ul> 
     * <li>제네릭(3/5):제네릭의 특징1-2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 19.
     */

class EmployeeInfo4{
	public int rank;
	EmployeeInfo4(int rank ){this.rank = rank;}
}
class Person4<T,S>{
	public T info;
	public S id;
	Person4(T info, S id){
		this.info = info;
		this.id = id;
	}
}

public class GenericDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo4 e = new EmployeeInfo4(1);
		Integer i = new Integer(10);
		Person4<EmployeeInfo4,Integer> p1 = new Person4<EmployeeInfo4,Integer> (e,i);
		System.out.println(p1.id.intValue());
	}
}
