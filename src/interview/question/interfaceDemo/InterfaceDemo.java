package interview.question.interfaceDemo;

/**
 * Can be add default and static methods in interfaces ?  
 *  yes we can 
 * 
 *  Can be override default and static methods in implementation class ? 
 *   we can override default method by changing the visibility of that method
 *   But we cannot override the static method if we implement that is not override it is method hiding
 **/
public class InterfaceDemo implements Animal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new InterfaceDemo();
		a.Eating();
		a.method1();
		a.method2();
		Animal.methodstatic();
	}

	@Override
	public void Eating() {
		// TODO Auto-generated method stub
		System.out.println("Eating");
	}

	@Override
	public void method1() {
		System.out.println("overide calling method 1");
	}
	
	
}


interface Animal{
	void Eating();
	default void method1() {
		System.out.println("calling method 1");
	}
	default void method2() {
		System.out.println("calling method 2");
	}
	static void methodstatic() {
		System.out.println("calling methodstatic 1");
	}
}