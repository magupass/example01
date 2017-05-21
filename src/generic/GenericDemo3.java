package generic;

/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>generic<br/>
 * <B>File Name : </B>GenericDemo3<br/>
 * <B>Description</B>
 * <ul>
 * <li>제네릭(2/5):제네릭의 사용이유2.
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 18.
 */

class StudentInfo1 {
	public int grade;

	StudentInfo1(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo1 {
	public int rank;

	EmployeeInfo1(int rank) {
		this.rank = rank;
	}
}

class Person1 {
	public Object info;

	Person1(Object info) {
		this.info = info;
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1("부장");
		EmployeeInfo1 ei = (EmployeeInfo1) p1.info;
		System.out.println(ei.rank);
	}

}
