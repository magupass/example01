package example02;

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>example02<br/>
     * <B>File Name : </B>MethodDemo6<br/>
     * <B>Description</B>
     * <ul> 
     * <li>숫자를 순서대로 출력하는 클래스
     * </ul>
     * 
     * @author magup
     * @since 2017. 4. 19.
     */
public class MethodDemo6 {

	/**
	     * <B>History</B>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : magup
	     * <li>넘버링 하는 method 
	     * </ul>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : magup
	     * <li>초기에 Method를 수정하는 경우 위의 ul~/ul 태그를 복사하여 아래에 붙여 넣고 수정된 내용에 대한 기록을 한다.
	     * </ul>
	     *  
	     * @param init: 초기시작값
	     * @param limit: 한계
	     * @return
	     */
	public static String numbering(int init,int limit){
		int i = init;
		String output = "";
		while(i<limit){
			//System.out.println(output);
			//System.out.println(i);
			output += i;
			//System.out.println(output);
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(1,11);
		//System.out.println(result);
	}

}
