package strings;

public class BufferExample {

	public static void main(String[] args) {
       StringBuffer s=new StringBuffer("hello");
       System.out.println(s);
       s.append("hai");
       System.out.println(s);
       s.insert(3, "welcome");
       System.out.println(s);
       s.replace(0, 3, "wor");
       System.out.println(s);
       System.out.println(s.reverse());
       s.delete(0, 4);
       System.out.println(s);
       
	}

}
