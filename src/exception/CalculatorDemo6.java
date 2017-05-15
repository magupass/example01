package exception;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>exception<br/>
     * <B>File Name : </B>CalculatorDemo6<br/>
     * <B>Description</B>
     * <ul> 
     * <li>��������� ����.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 12.
     */

class DivideException extends RuntimeException {
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}
class Calculator6{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo6 {
    public static void main(String[] args) {
        Calculator6 c1 = new Calculator6();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
