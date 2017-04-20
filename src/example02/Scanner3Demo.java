package example02;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 10);// 더 큰 수를 표현할 수 있는 방법은?
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
