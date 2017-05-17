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
		
		//Update the employee id (second parameter in the function call below) 
		//to a new and valid id before running this program
		//i.e., check the table in the DB before running this program and update the parameter as required
		Employee employee = (Employee)session.get(Employee.class, 1);
		System.out.println("Employee at ID=1 is "+employee);
		
		//deleting the record from DB table
		session.delete(employee);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		System.out.println("Employee at ID=1 has been deleted");
	
		session.flush();
		session.close();
	}
}
