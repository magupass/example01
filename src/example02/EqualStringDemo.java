package example02;

public class EqualStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);// ==을 사용하면 다르다는 결과를 출력
        System.out.println(a.equals(b));//equal을 사용해야 같다는 결과를 출력
	}

}
