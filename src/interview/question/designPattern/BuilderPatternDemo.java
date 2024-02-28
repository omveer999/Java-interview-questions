package interview.question.designPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		Person p=new Person.Builder("Product1").id(122).city("Indore").build();
		
		System.out.println(p);
		
	}
}
