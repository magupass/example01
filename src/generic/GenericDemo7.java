package generic;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>generic<br/>
     * <B>File Name : </B>GenericDemo7<br/>
     * <B>Description</B>
     * <ul> 
     * <li>제네릭(4/5):제네릭의 특징2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 19.
     */
class EmployeeInfo5{
	public int rank;
	EmployeeInfo5(int rank){
		this.rank = rank;
	}
}
class Person5<T,S>{
	public T info;
	public S id;
	Person5(T info, S id){
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo (U info){
		System.out.println(info);
	}
}
public class GenericDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo5 e = new EmployeeInfo5(1);
		Integer i = new Integer(10);
		//Person5<EmployeeInfo5, Integer> p1 = new Person5<EmployeeInfo5, Integer>(e,i);
		Person5 p1 = new Person5(e,i);
		p1.<EmployeeInfo5>printInfo(e);
		p1.printInfo(e);	
	}

}

