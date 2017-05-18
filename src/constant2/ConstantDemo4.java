package constant2;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>constant2<br/>
     * <B>File Name : </B>ConstantDemo4<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Java - ����� enum(2/4): enum�� ���2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 16.
     */
public class ConstantDemo4 {

	//fruit
	private final static int FRUIT_APPLE = 1;
	private final static int FRUIT_PEACH = 2;
	private final static int FRUIT_BANANA = 3;
	
	//company
	private final static int COMPANY_GOOGLE = 1;
	private final static int COMPANY_APPLE = 2;
	private final static int COMPANY_ORACLE = 3;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type = FRUIT_APPLE;
		switch(type){
			case FRUIT_APPLE:
				System.out.println(57 + " kcal");
				break;
			case FRUIT_PEACH:
				System.out.println(34 + " kcal");
				break;
			case FRUIT_BANANA:
				System.out.println(93 + " kcal");
				break;
		}
	}

}
