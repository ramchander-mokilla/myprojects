package hibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		//Need to create a manager and list of certificates
		ArrayList listOfCerts = new ArrayList();
		
		Certificate c1 = new Certificate();
		c1.setName("Java");
		
		Certificate c2 = new Certificate();
		c2.setName("Dot Net");
		
		Certificate c3 = new Certificate();
		c3.setName("Cloud");
		
		listOfCerts.add(c1);
		listOfCerts.add(c2);
		listOfCerts.add(c3);
		
		Manager manager = new Manager();
		manager.setName("Jerry");
		manager.setEmail("jerry@example.com");
		manager.setCertificates(listOfCerts);
		
		session.save(manager); //saving person will also save address in other table
		
		System.out.println(manager);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
			
		System.out.println("\n SUCCESS : Data persisted in DB");
	}
}
