package example02;

public class ReturnDemo4 {
 
    public static String[] getMembers() {
        String[] members = { "ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑÀÌ¶÷" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        System.out.println(members.length);
        System.out.println(members[0]);
        for (String e : members) {
			System.out.println(e);
		}
    }
 
}