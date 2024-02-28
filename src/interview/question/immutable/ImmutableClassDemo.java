package interview.question.immutable;

/**
 * In this class we create a instance of ImmutablePerson class 
 * that have primitive data type field and one Address type field that is mutable object.
 *
 * 
 */
public class ImmutableClassDemo {

	public static void main(String [] args) {
		Address address=new Address("200/3","Indore","MP","India");
		ImmutablePerson person=new ImmutablePerson(1,"omveer",21,address);
		address.setAddress("Updated Address");
		
		//If immutablePerson was  mutable class then  it prints the updated address in person
		//but it is immutable so it prints 200/3 address that were given at the creation of instance
		System.out.println(person); 
		System.out.println(address);
	}
}
