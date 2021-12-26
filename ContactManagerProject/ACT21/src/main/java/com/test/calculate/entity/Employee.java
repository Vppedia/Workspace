package com.test.calculate.entity;


import javax.persistence.Entity;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

@Entity
public class Employee {
	
	@ExcelRow                    
    private int rowIndex;   
	
	@ExcelCellName("emp_id") 
	private String emp_Id;
	
	@ExcelCellName("name") 
	private String name;
	
	@ExcelCellName("location") 
	private String location;
	
	
	
	
	public String getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(String emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Employee [rowIndex=" + rowIndex + ", emp_Id=" + emp_Id + ", name=" + name + ", location=" + location
				+ "]";
	}
	
	
	
	
	
	

}
