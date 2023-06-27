package collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(1001,"sathya",67,89,90,67,99);
		
	
		
		Student s2=new Student(1002,"hari",77,90,77,90,77);
		
		
		
		Student s3=new Student(1003,"priya",57,90,67,80,77);
		ArrayList<Student>list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		System.out.println("=======================sort");
		Collections.sort(list);
		System.out.println(list);

	}

}
