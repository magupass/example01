package accessmodifier;
//접근제어자
class A{
	public String y(){
		return "public void y()";
	}
	
	private String z(){
		return "public void z()";
	}
	
	public String x(){
		return "public void x()";
	}
}

public class AccessDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.y());
		//System.out.println(a.z());
		System.out.println(a.x());
	}

}
