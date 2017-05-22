package collection;

import java.util.*;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>collection<br/>
     * <B>File Name : </B>CollectionsDemo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Collections의 사용법과 정렬.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 22.
     */

class Computer implements Comparable{
	int serial;
	String owner;
	Computer(int serial,String owner){
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o){
		return this.serial - ((Computer)o).serial;
	}
	public String toString(){
		return serial + " " + owner;
	}
}

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "leeezche"));
		computers.add(new Computer(3233, "graphittie"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		Collections.reverse(computers);
		System.out.println("\nafter1");
		i = computers.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
