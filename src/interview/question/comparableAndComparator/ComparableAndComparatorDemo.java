package interview.question.comparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparatorDemo {

	public static void main(String[] args) {
		List<Student> sList=Arrays.asList(
		 new Student(1,"Omveer","A"),
		 new Student(3,"Abhishek","B"),
		 new Student(2,"Ajay","C"),
		 new Student(4,"Manoj","D")
		);
		
		Collections.sort(sList);
		//Here in above example student are sort in natural order on the basis of rollno
		System.out.println(sList);
		
		/*
		 * but if we want separate custom comparator on the basis on of name or grade or in combination of name and rollno
		 * then we create seprate class that implements comparators
		 */
		
		
		//Sort student on the basis of name
		NameComparator nameComparator=new NameComparator();
		Collections.sort(sList, nameComparator);
		System.out.println(sList);
		
		//Sort student on the basis of grade
		GradeComparator gradeComparator=new GradeComparator();
		Collections.sort(sList, gradeComparator);
		System.out.println(sList);
	}
}
