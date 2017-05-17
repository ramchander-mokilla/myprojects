package hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

//Note: Ensure the MySQL DB instance is running (from XAMPP control panel) before running this program
public class RetrieveSpecificRecordsFromTable {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
			
		//below statement will lead to reading the hibernate.cfg.xml file
		config.configure();
			
		//Session factory exists in configuration
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		//query the records from DB table using Hibernate Query Language
		List<Student> studentList = session.createQuery("From Student where rollNum>105").list();
		System.out.println("Following are records with rollNum > 105 :");
		for(Student student : studentList)
		{
			System.out.println(student);
		}
		
		studentList = session.createQuery("From Student where rollNum=125").list();
		for(Student student : studentList)
		{
			System.out.println(student);
		}
		
		//query using the Criteria class
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("rollNum", 200));
		studentList = criteria.list();
	
		for(Student student : studentList)
		{
			System.out.println(student);
		}		
	}
}
