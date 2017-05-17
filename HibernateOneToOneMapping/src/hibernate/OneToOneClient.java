package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneClient {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		Address address = new Address();
		address.setCity("Newyork");
		address.setState("NY");
		address.setZipCode(2212);
		
		Person person = new Person();
		person.setName("Katie");
		person.setAge(21);
		
		person.setAddress(address);
		address.setPerson(person);
		
		session.save(person); //saving person will also save address in other table
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
			
		System.out.println("\n SUCCESS : Data persisted in DB");
	}
}