package hibernate;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Note: Ensure the MySQL DB instance is running (from XAMPP control panel) before running this program
public class DeleteFromTable {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
			
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//Update the student id (second parameter in the function call below) 
		//to a new and valid id before running this program
		Student student = (Student)session.get(Student.class, 2);
		System.out.println("Student at ID=2 is "+student);
		
		//deleting the record from DB table
		session.delete(student);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		System.out.println("Student at ID=2 has been deleted");
	}
}
