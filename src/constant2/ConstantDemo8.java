package constant2;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>constant2<br/>
     * <B>File Name : </B>ConstantDemo8<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Java - 상수와 enum(4/4): 열거형의 활용1.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 17.
     */

enum Fruit3{
	APPLE, PEACH, BANANA;
	Fruit3(){
		System.out.println("Call Constructor " + this);
	}
}

enum Company3{
	GOOGLE, APPLE, ORACLE;
}


public class ConstantDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit3 type = Fruit3.APPLE;
		switch(type){
			case APPLE:
				System.out.println(57 + " kcal");
				break;
			case PEACH:
				System.out.println(34 + " kcal");
			case BANANA:
				System.out.println(93 + "k cal");
				break;
		}
	}

}
