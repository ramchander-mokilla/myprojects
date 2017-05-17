package springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjection {

	public static void main(String[] args) {

		//In Spring, Object is created using inversion of control
		//Object will be created for you, you write the configuration for the object in bean xml file
				
		ApplicationContext context= new ClassPathXmlApplicationContext("employeebean.xml");
		        
		Employee emp = context.getBean("emp3",Employee.class);
		System.out.println(emp);
		
		@SuppressWarnings("rawtypes")
		List qualifications = emp.getQualifications();
		
		for (int i=0; i<qualifications.size();i++)
		{
			System.out.println(qualifications.get(i));
		}
				
		//finally, close the application content context
		//bean will be destructed from memory
		((ClassPathXmlApplicationContext) context).close();
	}
}
