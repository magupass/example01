package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>collection<br/>
     * <B>File Name : </B>SetDemo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Set¿Ã∂ı?
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 22.
     */
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>A = new HashSet<Integer>();
		//ArrayList<Integer>A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		
		HashSet<Integer>B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B));//false
		System.out.println(A.containsAll(C));//true
		
		//A.addAll(B);
		//A.retainAll(B);
		//A.removeAll(B);
		
		Iterator hi = A.iterator();
		while(hi.hasNext()){
			System.out.println(hi.next());
		}
		
		
	}

}
