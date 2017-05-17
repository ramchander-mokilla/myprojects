package hibernate;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Note: Ensure the MySQL DB instance is running (from XAMPP control panel) before running this program
public class ReadAndUpdateTable {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
			
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee employee = (Employee)session.get(Employee.class, 6);
		System.out.println("Employee at ID=6 is "+employee);
		
		//editing records in the DB
		employee.setName("Jennie");
		employee.setSalary(94000);
		session.update(employee);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		employee = (Employee)session.get(Employee.class, 6);
		System.out.println("Employee at ID=6 is "+employee);
	}
}
