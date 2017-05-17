package springdemo;

import java.util.List;

public class Employee {

	int empId;
	String name;
	int salary;
	
	Address address; //'HAS-A' relationship
	
	@SuppressWarnings("rawtypes")
	List qualifications;
	
	public Employee() {
		
		System.out.println("In default Constructor");
	}
	
	//constructor taking address as input
	//constructor injection
	public Employee(Address address) {
		
		this.address = address;
	}

	public Employee(int empId, String name, int salary) {
		System.out.println("In parameterized Constructor");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}

	//setter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@SuppressWarnings("rawtypes")
	public List getQualifications() {
		return qualifications;
	}

	@SuppressWarnings("rawtypes")
	public void setQualifications(List qualifications) {
		this.qualifications = qualifications;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]"+
				"\nEmployee Address: "+address.toString()+
				"\nEmployee Qualifications: "+qualifications;
	}
	
	public void myInit()
	{
		System.out.println("In My Init Method");
	}
	
	public void myDestroy()
	{
		System.out.println("In My Destroy Method");
	}
}
