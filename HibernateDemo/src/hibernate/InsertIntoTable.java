package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//Note: Ensure the MySQL DB instance is running (from XAMPP control panel) before running this program
public class InsertIntoTable {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollNum(107);
		s1.setAddress("Newyork");
		s1.setName("Samantha");
	
		Student s2 = new Student();
		s2.setRollNum(108);
		s2.setAddress("Los Angeles");
		s2.setName("Keira");
		
		System.out.println(s1); //same as System.out.println(s1.toString()) 
		System.out.println(s2); //same as System.out.println(s2.toString())
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println("------------------------------------------------------------------------");
					
		Configuration config = new Configuration();
			
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
			
		//saves(inserts) the object data in DB
		session.save(s1);
		session.save(s2);
			
		Transaction transaction = session.beginTransaction();
		transaction.commit();
			
		System.out.println("\n SUCCESS : Data persisted in DB");
			
	}
}
