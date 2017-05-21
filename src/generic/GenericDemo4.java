package generic;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>generic<br/>
     * <B>File Name : </B>GenericDemo4<br/>
     * <B>Description</B>
     * <ul> 
     * <li>���׸�(2/5):���׸��� �������3.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 18.
     */
class StudentInfo2{
    public int grade;
    StudentInfo2(int grade){ this.grade = grade; }
}
class EmployeeInfo2{
    public int rank;
    EmployeeInfo2(int rank){ this.rank = rank; }
}
class Person2<T>{
    public T info;
    Person2(T info){ this.info = info; }
}
public class GenericDemo4 {
    public static void main(String[] args) {
        Person2<EmployeeInfo2> p1 = new Person2<EmployeeInfo2>(new EmployeeInfo2(1));
        EmployeeInfo2 ei1 = p1.info;
        System.out.println(ei1.rank); // ����
         
        Person2<String> p2 = new Person2<String>("����");
        String ei2 = p2.info;
        //System.out.println(ei2.rank); // ������ ����
    }
}
