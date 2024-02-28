package interview.question.designPattern;

public class OSFactory {

	public OS getInstance(String type) {
		if(type.equalsIgnoreCase("open"))
		  return new Android();	
		else if(type.equalsIgnoreCase("close"))
		  return new IOS();
		else
		return new Window();
	}
}
