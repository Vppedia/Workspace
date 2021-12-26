package com.assignment.test;

@Controller
public class TestClass {
	
	@Autowired
	EmployeeSerice service;
	
	public String emplDetails(Employee e)
	{
		service.empExist(e);
	}
	

}
