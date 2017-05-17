package springjdbc;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{

	@SuppressWarnings("unused")
	private DataSource datasource;
	private JdbcTemplate jdbcTemplateObject;
	
	//setter injection for datasource
	public void setDataSource(DataSource datasource) {
		this.datasource = datasource;
		jdbcTemplateObject = new JdbcTemplate(datasource);
	}

	//create and execute prepared sql query
	public void createStudent(Integer id, String name, Integer age) {
		String SQLQuery = "insert into Student (id,name,age) values (?,?,?)";
		jdbcTemplateObject.update(SQLQuery, id,name, age);
		System.out.println("Record Created.Name:"+name+" Age:"+age);		
	}

	public void getStudent(Integer id) {
		String SQLQuery = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQLQuery, 
				new Object[] { id }, new StudentMapper());
		System.out.println("\nStudent Id="+student.getId()+" Name="+student.getName()+" Age="+student.getAge());
	}

	
	public void listStudents() {
		String SQLQuery = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQLQuery, new StudentMapper());
		if(students.size()==0)
		{
			System.out.println("No records to display");
		}
		else
		{
			System.out.println("\nList of records in the database: ");
			for (int i=0; i<students.size(); i++)
			{
				System.out.println("Id="+students.get(i).getId()+ 
									" Name="+students.get(i).getName()+
									" Age="+students.get(i).getAge());
			}
		}			
	}

	
	public void deleteStudent(Integer id) {
		String SQLQuery = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQLQuery, id);
		System.out.println("\nDeleted record with ID = "+id);
	}

	public void updateStudent(Integer id, Integer age) {
		String SQLQuery = "update Student set age = ? where id = ?";
		jdbcTemplateObject.update(SQLQuery, age, id);
		System.out.println("\nUppdated record with ID = "+id);
	}

	public void deleteAllStudents() {
		String SQLQuery = "delete from Student";
		jdbcTemplateObject.update(SQLQuery);
		System.out.println("\nDeleted all records");
	}
}
