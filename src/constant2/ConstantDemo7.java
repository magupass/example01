package constant2;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>constant2<br/>
     * <B>File Name : </B>ConstantDemo7<br/>
     * <B>Description</B>
     * <ul> 
     * <li>Java - 상수와 enum(3/4): enum의 문법.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 16.
     */
enum Fruit2{
	APPLE, PEACH, BANANA;
}
enum Company2 {
	GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		if(Fruit.APPLE == Company.APPLE){
			System.out.println("과일 애플과 회사 애플이 같다.");
		}*/
		Fruit2 type = Fruit2.APPLE;
		switch(type){
			case APPLE:
				System.out.println(57 + " kcal");
				break;
			case PEACH:
				System.out.println(34 + " kcal");
				break;
			case BANANA:
				System.out.println(93 + " kcal");
				break;
		}
	}
}
