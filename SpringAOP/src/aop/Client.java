package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		//In Spring, Object is created using inversion of control
		//Object will be created for you, you write the configuration for the object in bean xml file
				
		ApplicationContext context= new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee emp = context.getBean("empBeanProxy", Employee.class);

		emp.sayHello(emp.getName());
		
		//finally, close the application content context
        //bean will be destructed from memory
        ((ClassPathXmlApplicationContext) context).close();
        
	}
}
