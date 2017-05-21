package generic;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>generic<br/>
     * <B>File Name : </B>GenericDemo5<br/>
     * <B>Description</B>
     * <ul> 
     * <li>제네릭(3/5):제네릭의 특징1-1.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 19.
     */
class EmployeeInfo3{
    public int rank;
    EmployeeInfo3(int rank){ this.rank = rank; }
}
class Person3<T, S>{
    public T info;
    public S id;
    Person3(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
}
public class GenericDemo5 {
    public static void main(String[] args) {
    	Integer id = new Integer(1);
        //Person3<EmployeeInfo3, Integer> p1 = new Person3<EmployeeInfo3, Integer>(new EmployeeInfo3(1), 1);
        Person3<EmployeeInfo3, Integer> p1 = new Person3<EmployeeInfo3, Integer>(new EmployeeInfo3(1), id);
        System.out.println(p1.id.intValue());
    }
}
