package com.practice.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoCollection {
	
	public static void main(String[] args)
	{
	  List<Employee> emp=  new ArrayList<Employee>();
	  emp.add(new Employee(1,"vivek","dev",100));
	  emp.add(new Employee(2,"suraj","testing",200));
	  emp.add(new Employee(3,"vijay","data Science",300));
	  emp.add(new Employee(4,"abhijeet","ML",400));
	  emp.add(new Employee(5,"pankaj","AI",500)); 
	  
	  emp.sort(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
		
			  if(o2.getSalary()>o1.getSalary())
				  return 1;
			  else
				  return -1;
			  
			
		}
	});  
		
	  
	  System.out.println(emp);
	}

}
