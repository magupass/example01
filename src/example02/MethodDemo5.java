package example02;

public class MethodDemo5 {

	public static void numbering(int init, int limit){
		int i = init;
		while(i < limit){
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbering(98,100);
	}

}
