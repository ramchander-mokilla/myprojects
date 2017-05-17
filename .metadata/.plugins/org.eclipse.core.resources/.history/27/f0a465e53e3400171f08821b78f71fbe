package springjdbc;

import javax.sql.DataSource;

//This interface is to be implemented by the StudentJDBCTemplate class
public interface StudentDAO {
	
	//method to initialize database resources (connection)
	public void setDataSource(DataSource ds);
	
	//method to create record in the database
	public void createStudent(Integer id, String name, Integer age);

	//method to get a student record based on student id
	public void getStudent(Integer id);
	
	//method to list out all the records from the Student table
	public void listStudents();
	
	//method to delete a record from the Student table
	public void deleteStudent(Integer id);
	
	//method to update a specific record in the Student table
	public void updateStudent(Integer id, Integer age);

	//method to delete all records from the Student table
	public void deleteAllStudents();
}