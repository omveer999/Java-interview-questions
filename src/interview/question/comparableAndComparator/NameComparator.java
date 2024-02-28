package interview.question.comparableAndComparator;

import java.util.Comparator;

/**
 * Custom comparator for student that compare the two student objects 
 * on the basis of name
 */
public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
