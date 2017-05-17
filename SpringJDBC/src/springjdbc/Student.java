package springjdbc;

//POJO (Plain Old Java Object) class
public class Student {
	
	//attributes
	private Integer id;
	private String name;
	private Integer age;
	
	//Methods
	public Student() 
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}

