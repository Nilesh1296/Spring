package com.bridgeit.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	/*Resource resource=new ClassPathResource("application.xml");  
        BeanFactory factory=new XmlBeanFactory(resource);  
          
        Student student=(Student)factory.getBean("studentbean");  
        student.displayInfo();  
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
*/    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		System.out.println("Spring Context initialized");
		
		//MyEmployeeService service = ctx.getBean("myEmployeeService", MyEmployeeService.class);
		EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);

		System.out.println("Bean retrieved from Spring Context");
		
		System.out.println("Employee Name="+service.getEmployee().getName());
		
		ctx.close();
		System.out.println("Spring Context Closed");
	}

    
}
