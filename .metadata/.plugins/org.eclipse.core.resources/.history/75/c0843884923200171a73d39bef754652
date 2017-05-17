package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertIntoTable {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		
		//create the session to persist object in DB
		Session session = factory.openSession();
		
		Employee e1 = new Employee();
		e1.setName("Joyce");
		e1.setSalary(123000);
	
		Employee e2 = new Employee();
		e2.setName("Anna");
		e2.setSalary(89000);
		
		System.out.println(e1); //same as System.out.println(s1.toString()) 
		System.out.println(e2); //same as System.out.println(s2.toString())
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		System.out.println("------------------------------------------------------------------------");
					
		//saves(inserts) the object data in DB
		session.save(e1);
		session.save(e2);
			
		Transaction transaction = session.beginTransaction();
		transaction.commit();
			
		System.out.println("\n SUCCESS : Data persisted in DB");
	
		session.flush();
		session.close();
	}
}
