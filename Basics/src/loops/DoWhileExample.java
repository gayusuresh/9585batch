package loops;

public class DoWhileExample {

	public static void main(String[] args) {
		int i=1;
		do
		{
			System.out.println(i);//1,2,3,--10
			i++;//2,3,4---10,11
		}
		while(i>=10);//2<=10 3<=10---10<=10 11<=10=f
	}

}
