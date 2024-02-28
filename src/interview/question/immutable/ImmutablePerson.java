package interview.question.immutable;

public final class ImmutablePerson {

	private final int id;
	private final String name;
	private final int age;
	private final Address address;
	
   ImmutablePerson(int id,String name,int age, Address address){
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=new Address(address.getAddress(),address.getCity(),address.getState(),address.getCountry());
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Address getAdress() {
		return new Address(address.getAddress(),address.getCity(),address.getState(),address.getCountry());
	}

	@Override
	public String toString() {
		return "ImmutablePerson [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
