package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Annotations help us provide the same details as would otherwise need a mapping file.
//i.e., employee.hbm.xml is not required in this case

@Entity
public class Employee {
	
	@Id @GeneratedValue
	@Column(name="empid")
	int id;
	
	@Column(name="empsal")
	int salary;
	
	@Column(name="empname")
	String name;
		
	//Methods
	public Employee() 
	{
		
	}
	
	public Employee(int id, int salary, String name) 
	{
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getSalary() 
	{
		return salary;
	}
	
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}	
	
}

