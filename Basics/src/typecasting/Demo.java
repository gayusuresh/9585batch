package typecasting;

public class Demo {

	public static void main(String[] args) {
		int i=4;
		double j=i;
		System.out.println(j);//wideining
       double k=9.4;
       
       int l=(int)k;//narrowing
       System.out.println(l);
	}

}
