package example02;

public class MethodDemo6 {

	public static String numbering(int init,int limit){
		int i = init;
		String output = "";
		while(i<limit){
			//System.out.println(output);
			//System.out.println(i);
			output += i;
			//System.out.println(output);
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(1,11);
		//System.out.println(result);
	}

}
