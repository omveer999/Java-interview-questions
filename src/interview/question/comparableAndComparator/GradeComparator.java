package interview.question.comparableAndComparator;

import java.util.Comparator;

/**
 * Create a custom comparator for student class that compare students object on the base of grade
 * */
public class GradeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getGrade().compareTo(o2.getGrade());
	}

}
