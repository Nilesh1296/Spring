package com.bridgeit.JDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringDao 
{
	private JdbcTemplate jdbcTemplate;  
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public int saveEmployee(Spring e){  
	    String query="insert into spring values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
	    return jdbcTemplate.update(query);  
	} 
	
	public int updateEmployee(Spring e){  
	    String query="update spring set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Spring e){  
	    String query="delete from spring where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  

}
