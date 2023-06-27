package exceptionhandling;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(1001,"sathya",45,45,66,57,39);
		
		System.out.println(s1);
		System.out.println("==================================");
		Student s2=new Student(1002,"hari",77,90,77,90,77);
		
		System.out.println(s2);
		System.out.println("======================================");
		Student s3=new Student(1003,"divya",99,96,75,95,67);
		System.out.println(s3);

		checkPercentage(s1);
		

	}
	public static void checkPercentage(Student s)
	{
		if(s.percentage()<60)
		{
			try
			{
			throw new NotEligibleForPlacementException("not eligible for placment");
			}
			catch(NotEligibleForPlacementException e)
			{
				System.out.println(e);
			}
		}
	}

}
