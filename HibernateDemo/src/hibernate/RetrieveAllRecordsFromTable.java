package hibernate;

import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Note: Ensure the MySQL DB instance is running (from XAMPP control panel) before running this program
public class RetrieveAllRecordsFromTable {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
			
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//query the records from DB table using Hibernate Query Language
		@SuppressWarnings("unchecked")
		List<Student> studentList = session.createQuery("From Student").list();
		for(Student s : studentList)
		{
			System.out.println(s);
		}
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();		
	}
}
