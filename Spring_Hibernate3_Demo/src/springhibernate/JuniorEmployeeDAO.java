package springhibernate;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.hibernate.SessionFactory;

public class JuniorEmployeeDAO {

	HibernateTemplate template;
	
	public void setSessionFactory(SessionFactory factory){
		
		template = new HibernateTemplate(factory);
	}
	
	public void saveEmployee(JuniorEmployee e){
		//this will save employee object in the database
		template.save(e);
	}
	
	public void deleteEmployee(JuniorEmployee e){
		//this will delete employee object from the database
		template.delete(e);
	}
}

