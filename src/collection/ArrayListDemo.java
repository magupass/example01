package collection;

import java.util.ArrayList;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>collection<br/>
     * <B>File Name : </B>ArrayListDemo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>ArrayList의 사용법
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 22.
     */
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1]= "two";
		//arrayObj[2] = "three''; 
		for (int i = 0; i<arrayObj.length; i++){
			System.out.println(arrayObj[i]);
		}
		//ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList<String>();
		al.add("one+");
		al.add("two+");
		al.add("three+");
		//for(int i=0; i<al.size(); i++){
		//	System.out.println(al.get(i));
		//}
		
		//for(int i = 0; i<al.size();i++){
		//	String val = (String)al.get(i);
		//	System.out.println(val);
		//}
		for(int i=0; i<al.size();i++){
			String val = al.get(i);
			System.out.println(val);
		}
		
	}

}
