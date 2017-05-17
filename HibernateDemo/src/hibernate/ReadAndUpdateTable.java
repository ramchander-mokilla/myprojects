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
		
		Student student = (Student)session.get(Student.class, 4);
		System.out.println("Student at ID=4 is "+student);
		
		//editing records in the DB
		student.setAddress("Lake Oswego");
		student.setRollNum(125);
		
		session.update(student);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		student = (Student)session.get(Student.class, 4);
		System.out.println("Student at ID=4 is "+student);
	}
}
