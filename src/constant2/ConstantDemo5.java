package constant2;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>constant2<br/>
     * <B>File Name : </B>ConstantDemo5<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Java - 상수와 enum(2/4): enum의 배경3.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 16.
     */

interface FRUIT{
	int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY {
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}


public class ConstantDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type = FRUIT.APPLE;
		switch(type){
			case FRUIT.APPLE:
				System.out.println(57 + " kcal");
				break;
			case FRUIT.PEACH:
				System.out.println(34 + " kcal");
				break;
			case FRUIT.BANANA:
				System.out.println(93 + " kcal");
				break;
		}
	}

}
