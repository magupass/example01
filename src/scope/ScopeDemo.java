package scope;

public class ScopeDemo {
    //static int i;
	static void a() {
    int i = 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for ( int  i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
	}

}
