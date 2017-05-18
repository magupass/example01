package constant2;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>constant2<br/>
     * <B>File Name : </B>ConstantDemo2<br/>
     * <B>Description</B>
     * <ul> 
     * <li>상수와 enum(1/4) : 상수에 대한 복습2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 15.
     */
public class ConstantDemo2 {
	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type = APPLE;
		switch(type){
		case APPLE:
			System.out.println(57+" kcal");
			break;
		case PEACH:
			System.out.println(34+" kcal");
			break;
		case BANANA:
			System.out.println(93+" kcal");
			break;
		}
			
		}
}
