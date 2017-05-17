package hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Note: Ensure the MySQL DB instance is running (from XAMPP control panel) before running this program
public class RetrieveSpecificRecordsFromTable {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
			
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//query the records from DB table using Hibernate Query Language
		List<Employee> employeeList = session.createQuery("From Employee where salary>65000").list();
		System.out.println("Following are records with salary > 65000 :");
		for(Employee employee : employeeList)
		{
			System.out.println(employee);
		}
		
		employeeList = session.createQuery("From Employee where name = 'Joyce'").list();
		for(Employee employee : employeeList)
		{
			System.out.println(employee);
		}
	}
}
