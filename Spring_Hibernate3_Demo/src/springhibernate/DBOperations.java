package springhibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBOperations {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		BeanFactory factory = context;
		
		JuniorEmployeeDAO dao = factory.getBean("dao",JuniorEmployeeDAO.class);
		
		JuniorEmployee jEmp = new JuniorEmployee();
		jEmp.setId(1);
		jEmp.setName("Tough Guy");
		jEmp.setSalary(23045);

		dao.saveEmployee(jEmp);
		System.out.println("Record Inserted");

		((ClassPathXmlApplicationContext)context).close();
	}

}
