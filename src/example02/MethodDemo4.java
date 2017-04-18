package example02;

public class MethodDemo4 {

	
	public static void numbering(int limit){
		int i=0;
		while(i<limit){
			System.out.println(i);
			i++;
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbering(100000);
	}

}
