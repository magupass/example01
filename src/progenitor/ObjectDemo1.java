package progenitor;
/**
 * <B>Project Name : </B>Basic_Practice<br/>
 * <B>Package Name : </B>progenitor<br/>
 * <B>File Name : </B>ObjectDemo1<br/>
 * <B>Description</B>
 * <ul> 
 * <li>equals.
 * </ul>
 * 
 * @author magup
 * @since 2017. 5. 14.
 */
class Student{
	String name;
	Student (String name){
		this.name = name;
	}
	
	public boolean equals (Object obj){
		Student _obj = (Student)obj;
		return name == _obj.name;
	}
}

public class ObjectDemo1 {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student	s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
