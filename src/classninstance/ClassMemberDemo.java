package classninstance;


class C1 {
	static int static_variable = 1;
	int instance_variable = 2;

	static void static_static() {
		System.out.println(static_variable + "aaa" ); 
	}

	static void static_instance() {
		// Ŭ���� �޼ҵ忡���� �ν��Ͻ� ������ ������ �� ����.
		
		 //System.out.println(instance_variable);
	}

	void instance_static() {
		// �ν��Ͻ� �޼ҵ忡���� Ŭ���������� ������ �� �ִ�.
		System.out.println(static_variable + "bbb");
	}

	void instance_instance() {
		System.out.println(instance_variable + "ccc");
	}
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();

		c.static_static();
		// aaa
		// �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
		// �ν��Ͻ� �޼ҵ尡 ���� ������ ���� -> ����		
		

		c.static_instance();
		//�������
		// ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
		
		
		c.instance_static();
		// bbb
		// �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
		// �ν��Ͻ� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
		
		
		c.instance_instance();
		//ccc
		//Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
		//Ŭ���� �޼ҵ尡 Ŭ���� ������ ���� -> ����

		
		C1.static_static();
		//aaa
		// Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����

		

		//C1.static_instance();
		//�������
		// Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
		

		// C1.instance_static();
		//����
		// Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
		

		//C1.instance_instance();
		//����
		// Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����

	}

}
