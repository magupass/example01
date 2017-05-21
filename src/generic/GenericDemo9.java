package generic;

/**
     * <B>Project Name : </B>Basic_Practice<br/>
     * <B>Package Name : </B>generic<br/>
     * <B>File Name : </B>GenericDemo9<br/>
     * <B>Description</B>
     * <ul> 
     * <li>제네릭(5/5):제네릭의 제한2-2.
     * </ul>
     * 
     * @author magup
     * @since 2017. 5. 19.
     */
interface Info1{
    int getLevel();
}
class EmployeeInfo7 implements Info1{
    public int rank;
    EmployeeInfo7(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person7<T extends Info1>{
    public T info;
    Person7(T info){ this.info = info; }
}
public class GenericDemo9 {
    public static void main(String[] args) {
        Person7 p1 = new Person7(new EmployeeInfo7(1));
        //Person7<String> p2 = new Person7<String>("부장");
    }
}