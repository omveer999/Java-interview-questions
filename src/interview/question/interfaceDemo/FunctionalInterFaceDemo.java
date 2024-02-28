package interview.question.interfaceDemo;

/**
 * @FunctionalInterface annotation is not necessary to use if interface has only one abstract method 
 * then that interface is known as functional interface.
 * 
 * **/
@FunctionalInterface  
interface MyFunctionalInterface{
	
	int calculate(int a,int b);
 
}

public class FunctionalInterFaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface add=(a,b)->a+b;
		MyFunctionalInterface sub=(a,b)->a-b;
		MyFunctionalInterface mul=(a,b)->a*b;
		MyFunctionalInterface div=(a,b)->a/b;
		System.out.println("addition="+add.calculate(10, 20));
		System.out.println("substraction="+sub.calculate(10, 20));
		System.out.println("multiplication="+mul.calculate(10, 20));
		System.out.println("divison="+div.calculate(10, 20));
	}

}
