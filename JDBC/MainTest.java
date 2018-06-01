package com.bridgeit.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest 
{
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");  
	      
	    SpringDao dao=(SpringDao)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Spring(102,"Amit",35000));  
	    System.out.println(status);  
	          
	   
	      
	}  
	
	
	
}
