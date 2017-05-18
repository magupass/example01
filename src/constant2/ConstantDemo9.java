package constant2;

enum Fruit4{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color;
	Fruit4(String colro){
		System.out.println("Call Constructor "+this);
		this.color = color;
	}
}
enum Company4{
	GOOGLE, APPLE, ORACLE;
}
/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>constant2<br/>
     * <B>File Name : </B>ConstantDemo9<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Java - 상수와 enum(4/4): 열거형의 활용2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 18.
     */
public class ConstantDemo9 {

	public static void main(String[] args) {
		Fruit4 type = Fruit4.APPLE;
		switch(type){
			case APPLE:
				System.out.println(57 +" kcal,  "+Fruit4.APPLE.color);
				break;
			case PEACH:
				System.out.println(34 + " kcal"+ Fruit4.PEACH.color);
				break;
			case BANANA:
				System.out.println(93 +" kcal" + Fruit4.BANANA.color);
				break;
				
		}

	}

}
