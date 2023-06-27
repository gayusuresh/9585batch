package oops;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(1001,"sathya",67,89,90,67,99);
		
		System.out.println(s1);
		System.out.println("==================================");
		Student s2=new Student(1002,"hari",77,90,77,90,77);
		
		System.out.println(s2);
		System.out.println("======================================");
		Student s3=new Student();
		s3.setId(1003);
		s3.setName("gayathri");
		s3.setM1(78);
		s3.setM2(58);
		s3.setM3(68);
		s3.setM4(88);
		s3.setM5(98);
		System.out.println(s3.getId());
		System.out.println(s3.getName());
		System.out.println(s3.getM1());

		System.out.println(s3.getM2());
		System.out.println(s3.getM3());
		System.out.println(s3.getM4());
		System.out.println(s3.getM5());

		//s3.id=1003;
		//s3.name="jaya";
		//System.out.println(s3.id);
		//System.out.println(s3.name);
		

	}

}
