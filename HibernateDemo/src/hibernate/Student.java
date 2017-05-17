package hibernate;

//POJO (Plain Old Java Object) class
public class Student {
	
	//attributes
	int id;
	int rollNum;
	String name;
	String address;
	
	//Methods
	public Student() 
	{
		
	}
	
	public Student(int id, int rollNum, String name, String address) 
	{
		super();
		this.id = id;
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getRollNum() 
	{
		return rollNum;
	}
	
	public void setRollNum(int rollNum) 
	{
		this.rollNum = rollNum;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", rollNum=" + rollNum + ", name=" + name + ", address=" + address + "]";
	}	
	
}

