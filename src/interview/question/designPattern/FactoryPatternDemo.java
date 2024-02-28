package interview.question.designPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		OSFactory osf=new OSFactory();
		OS os=osf.getInstance("close");
		os.spec();

	}

}
