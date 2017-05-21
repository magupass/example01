package reference;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>reference<br/>
     * <B>File Name : </B>ReferenceDemo1<br/>
     * <B>Description</B>
     * <ul> 
     * <li>참조(1/4):복제란?
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 18.
     */
public class ReferenceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = a;
		
		b=2;
		System.out.println("runValue, "+a);
		

	}

}
