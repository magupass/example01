package example02;
import java.io.*;

public class FilePathSearch {

	public static void getFileList(String path){
		File dir =  new File("D:\\���߽ǽ�\\��Ȱ�ڵ�\\js\\nodejs");
		//D:\���߽ǽ�\��Ȱ�ڵ�\js\nodejs
		File[] fileList = dir.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			File file = fileList[i];
			if(file.isFile()){
				System.out.println("\t �����̸� = " + file.getName());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File dir = new File("C:\\");
		System.out.println("aaaaaaaaaaaaa");
		String path = "c:\\";
		getFileList(path);
		
		System.out.println("bbbbbbbbbbbbbb");
		
		//String path = "d:eclipse\\";
		getFileList(path);
	}

}
