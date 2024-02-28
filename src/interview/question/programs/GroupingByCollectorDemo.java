package interview.question.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import interview.question.comparableAndComparator.Student;

public class GroupingByCollectorDemo {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"omveer","A");
		Student s2=new Student(2,"Abhishek","B");
		Student s3=new Student(3,"Ajay","A");
		Student s4=new Student(4,"Aman","C");
		Student s5=new Student(5,"Ankit","B");
		
		List<Student> listStudent=new ArrayList<>();
		listStudent.add(s1);
		listStudent.add(s2);
		listStudent.add(s3);
		listStudent.add(s4);
		listStudent.add(s5);
		
		//Group the List of Student by grade
		Map<String, List<Student>> groupedSudent=listStudent.stream().collect(Collectors.groupingBy(Student::getGrade));
		
		System.out.println(groupedSudent);
	}
	
}
