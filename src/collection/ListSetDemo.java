package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>collection<br/>
     * <B>File Name : </B>ListSetDemo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>List와 Set의 차이점.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 22.
     */
public class ListSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("five");
		System.out.println("array");
		Iterator ai = al.iterator();
		while(ai.hasNext()){
			System.out.println(ai.next());
		}
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		hs.add("five");
		Iterator hi = hs.iterator();
		System.out.println("\nhashset");
		while(hi.hasNext()){
			System.out.println(hi.next());
		}
	}

}
