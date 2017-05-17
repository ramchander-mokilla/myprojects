package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceClient {

	public static void main(String[] args) {
	
		//In Spring, Object is created using inversion of control
		//Object will be created for you, you write the configuration for the object in bean xml file
		
		ApplicationContext context= new ClassPathXmlApplicationContext("employeebean.xml");
        
		ContractEmployee contractEmployee = context.getBean("cEmp103",ContractEmployee.class);
		System.out.println("Employee is"+contractEmployee);
		contractEmployee.name="Vivian";
		contractEmployee.setEmpId(201);
		contractEmployee.setSalary(123000);
		System.out.println("Employee is"+contractEmployee);
		
        //finally, close the application content context
        //bean will be destructed from memory
        ((ClassPathXmlApplicationContext) context).close();
	}
}
