package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	
		//In Spring, Object is created using inversion of control
		//Object will be created for you, you write the configuration for the object in bean xml file
		
		ApplicationContext context= new ClassPathXmlApplicationContext("employeebean.xml");
        
		Employee emp1 =(Employee) context.getBean("emp1");
        //instead of the above statement, we can also use the below statement
        Employee emp2 =context.getBean("emp2",Employee.class);
        
        System.out.println(emp1+"\n");
        System.out.println(emp2+"\n");
        
        Employee emp3= context.getBean("emp3",Employee.class);
        System.out.println(emp3);
        
        //finally, close the application content context
        //bean will be destructed from memory
        ((ClassPathXmlApplicationContext) context).close();
	}
}
