package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiring {

	public static void main(String[] args) {

		//In Spring, Object is created using inversion of control
		//Object will be created for you, you write the configuration for the object in bean xml file
				
		ApplicationContext context= new ClassPathXmlApplicationContext("employeebean.xml");
		        
		CB cb = context.getBean("cb",CB.class);
		CA ca = cb.getCa();
		
		ca.showA();
		cb.showB();
		
		//finally, close the application content context
		//bean will be destructed from memory
		((ClassPathXmlApplicationContext) context).close();

	}
}
