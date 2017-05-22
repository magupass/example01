package collection;

import java.util.*;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>collection<br/>
     * <B>File Name : </B>MapDemo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Map의 기본 사용법(2/2).
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 22.
     */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("one",1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
	
	static void iteratorUsingForEach(HashMap map){
		Set<Map.Entry<String, Integer>>entries = map.entrySet();
		for(Map.Entry<String,Integer> entry : entries){
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
	}
	static void iteratorUsingIterator(HashMap map){
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer>entry = i.next();
			System.out.println(entry.getKey()+" ::: "+ entry.getValue());
		}
	}
}
