package springdemo;

public class Address {

	String city;
	String zipCode;
	
	public Address() {
		
	}
	
	public Address(String city, String zipCode) {
		this.city = city;
		this.zipCode = zipCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCode=" + zipCode + "]";
	}
}
