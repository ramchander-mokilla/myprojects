package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceClient {

	//run the program and review the table CA created in the DB
	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		CA ca = new CA();
		ca.setA(10);
		
		CB cb = new CB();
		cb.setA(100);
		cb.setB(200);
		
		CC cc = new CC();
		cc.setA(1000);
		cc.setB(2000);
		cc.setC(3000);
				
		session.save(ca); 
		session.save(cb);
		session.save(cc);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
			
		System.out.println("\n SUCCESS : Data persisted in DB");
	}
}
