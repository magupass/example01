package constant2;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>constant2<br/>
     * <B>File Name : </B>ConstantDemo6<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Java - 상수와 enum(2/4): enum의 배경4.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 16.
     */

class Fruit1 {
	public static final Fruit1 APPLE = new Fruit1();
	public static final Fruit1 PEACH = new Fruit1();
	public static final Fruit1 BANANA = new Fruit1();
}
class Company1{
	public static final Company1 GOOGLE = new Company1();
	public static final Company1 APPLE = new Company1();
	public static final Company1 ORACLE = new Company1();
}


public class ConstantDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if(Fruit1.APPLE == Company1.APPLE){
			System.out.println("과일 애플과 회사 애플이 같다");
		}*/
	}

}
