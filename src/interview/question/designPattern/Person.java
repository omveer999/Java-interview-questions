package interview.question.designPattern;

public class Person {
	private String name;
	private int id;
	private String city;
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

	private Person(Builder builder) {
		this.name=builder.name;
		this.id=builder.id;
		this.city=builder.city;
	}
	
	public static class Builder{
		private String name;
		private int id;
		private String city;
		
		public Builder(String name) {
			this.name=name;
		}
		
		public Builder id(int id) {
			this.id=id;
			return this;
		}
		
		public Builder city(String city) {
			this.city=city;
			return this;
		}
		
		public Person build() {
		 return new Person(this);	
		}
	}
}
