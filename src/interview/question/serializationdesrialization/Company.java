package interview.question.serializationdesrialization;

import java.io.Serializable;

public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long id;
	String name;
	String address;
	String domain;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	
	public Company(long id, String name, String address, String domain) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.domain = domain;
	}
	
	
	
	public Company() {
		
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + ", domain=" + domain + "]";
	}
	
	
}
