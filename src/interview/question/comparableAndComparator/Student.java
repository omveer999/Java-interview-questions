package interview.question.comparableAndComparator;

/**
 * this class implements the comparable and sort the student in naturale order 
 * on the basis of rollno feild
 */
public class Student implements Comparable<Student>{
	int rollno;
	String name;
	String grade;
	
	
	public Student() {
		super();
	}
	public Student(int rollno, String name, String grade) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", grade=" + grade + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	@Override
	public int compareTo(Student otherStudent) {
		return Integer.compare(this.rollno,otherStudent.getRollno() );
	}
	
	
}
