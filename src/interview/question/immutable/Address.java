package interview.question.immutable;

/**
 * Address class with all setter and getter. 
 *  
 * It is mutable class
 */
public class Address {
	String address;
	String city;
	String state;
	String country;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "ImmutableAddress [address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	public Address(String address, String city, String state, String country) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Address() {
		super();
	}
	

}
