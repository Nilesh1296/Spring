package com.bridgeit.GetterSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main 
{

	public static void main(String[] args)
	{
	Resource r=new ClassPathResource("application.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    User s=(User)factory.getBean("obj");  
    s.display();  
	}
}
