package example02;

public class PrePostDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 3;
        i++;
        System.out.println(i); // 4 ���
        ++i;
        System.out.println(i); // 5 ���
        System.out.println(++i); // 6 ���
        System.out.println(i++); // 6 ���
        System.out.println(i++); // 7 ���
        System.out.println(i); // 8 ���
	}

}