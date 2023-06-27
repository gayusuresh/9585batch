package exceptionhandling;

public class VoteEligible
{
	public static void checkValidate(int age) throws Exception
	{
		if(age>=18)
		{
			System.out.println("welcome to vote");
		}
		else
		{
			throw new Exception("invalid age");
		}
	}

	public static void main(String[] args) throws Exception {
		checkValidate(12);

	}

}
