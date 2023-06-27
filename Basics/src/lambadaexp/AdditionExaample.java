package lambadaexp;

public class AdditionExaample {

	public static void main(String[] args) {
		Addition a=(int x,int y)->
		{
			return x+y;
		};
		System.out.println(a.add(3, 4));
      a.display();
	}

}
