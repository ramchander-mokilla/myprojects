package aop;

public class Employee {
	
	int id;
	String name;
	String phone;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String phone) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void sayHello(String name){
		System.out.println("Hello, "+name);
	}
	
	//method with Business logic implementation
	public void showEmployee(int id, String name, String phone) {
		
		System.out.println("Employee is: "+id+"-"+name+"-"+phone);
	}
}
