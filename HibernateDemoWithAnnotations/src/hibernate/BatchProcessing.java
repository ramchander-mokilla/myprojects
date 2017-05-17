package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//Note: Ensure the MySQL DB instance is running (from XAMPP control panel) before running this program
public class BatchProcessing {

	public static void main(String[] args) {
		
		int i;
		
		Configuration config = new Configuration();
			
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//save 100 objects in session
		for(i=1; i<=100; i++)
		{
			Employee employee = new Employee();
			employee.setName("Name "+i);
			employee.setSalary(i*1000);
			//save the session object
			session.save(employee);
		}
		
		//this will now be a batch transaction with 100 session objects being executed as batch
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		System.out.println("Completed batch transaction for "+i+" records through session objects");
		
		session.flush();
		session.close();
	}
}