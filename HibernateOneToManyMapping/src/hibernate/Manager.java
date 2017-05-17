package hibernate;

import java.util.List;

@SuppressWarnings("rawtypes")
public class Manager {
	
	int id;
	String name, email;
	
	List certificates; //multiple certifications

	public Manager(int id, String name, String email, List certificates) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.certificates = certificates;
	}
	
	public Manager() {
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List getCertificates() {
		return certificates;
	}

	public void setCertificates(List certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", email=" + email + ", certificates=" + certificates + "]";
	}
	
}
