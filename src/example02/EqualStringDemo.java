package example02;

public class EqualStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);// ==�� ����ϸ� �ٸ��ٴ� ����� ���
        System.out.println(a.equals(b));//equal�� ����ؾ� ���ٴ� ����� ���
	}

}
