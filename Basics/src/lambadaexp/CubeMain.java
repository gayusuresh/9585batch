package lambadaexp;

public class CubeMain 
{
	public int display(int x)
	{
		return x;
	}

	public static void main(String[] args)
	{
	CubeMain cube=new CubeMain();
	Cube c1=cube::display;
		Cube c=(int x)->
		{
			
			return x*x*x;
		};
		System.out.println(c.cube(3));
		
		System.out.println(c1.cube(6));
	}

}
