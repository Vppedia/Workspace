package com.test.calculate.entity;

import javax.persistence.Entity;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;


@Entity
public class Fraud {
	
	@ExcelRow                    
    private int rowIndex;   
	
	@ExcelCellName("emp_id") 
	private String emp_Id;

	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public String getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(String emp_Id) {
		this.emp_Id = emp_Id;
	}

	@Override
	public String toString() {
		return "Fraud [rowIndex=" + rowIndex + ", emp_Id=" + emp_Id + "]";
	}
	
	

}
