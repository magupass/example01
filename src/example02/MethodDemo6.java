package example02;

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>example02<br/>
     * <B>File Name : </B>MethodDemo6<br/>
     * <B>Description</B>
     * <ul> 
     * <li>���ڸ� ������� ����ϴ� Ŭ����
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
	     * <li>�ѹ��� �ϴ� method 
	     * </ul>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : magup
	     * <li>�ʱ⿡ Method�� �����ϴ� ��� ���� ul~/ul �±׸� �����Ͽ� �Ʒ��� �ٿ� �ְ� ������ ���뿡 ���� ����� �Ѵ�.
	     * </ul>
	     *  
	     * @param init: �ʱ���۰�
	     * @param limit: �Ѱ�
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
