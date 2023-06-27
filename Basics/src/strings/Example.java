package strings;

public class Example {

	public static void main(String[] args) {
		String s="hello";
		String s1="hello";
		System.out.println(s);
		System.out.println(s.charAt(1));//index based character //e
		System.out.println(s.indexOf('h'));//character based index
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(1,4));
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s1));//
		System.out.println(s.contains("h"));
		System.out.println(s.startsWith("h"));
		System.out.println(s.endsWith("o"));
		System.out.println(s.compareTo(s1));//
		System.out.println(s.concat(s1));
		System.out.println(s.hashCode());//unique value of the string
		System.out.println(s1.hashCode());
		System.out.println(s.trim());
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.length());//
		System.out.println(s);
		
		
		
	}

}
