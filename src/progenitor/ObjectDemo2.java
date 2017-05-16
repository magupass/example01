package progenitor;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>progenitor<br/>
     * <B>File Name : </B>ObjectDemo2<br/>
     * <B>Description</B>
     * <ul> 
     * <li>clone.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 14.
     */

class Student1 implements Cloneable{
	String name ;
	Student1(String name){
		this.name = name;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class ObjectDemo2 {

	public static void main(String[] args) {
		Student1 s1 = new Student1("egoing");
		try {
			Student1 s2 = (Student1)s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}
