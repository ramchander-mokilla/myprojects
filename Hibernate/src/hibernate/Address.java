package hibernate;

public class Address {
	
	int id;
	String city, state;
	int zipCode;
	Person person; //Has-A relationship

	public Address() {
		
	}
	
	public Address(int id, String city, String state, int zipCode, Person person) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
