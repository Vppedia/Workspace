package com.test.calculate.entity;

import javax.persistence.Entity;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

@Entity
public class Transactions {

	@ExcelRow
	private int rowIndex;

	@ExcelCellName("emp_id")
	private String emp_Id;

	@ExcelCellName("trans_id")
	private String trans_id;

	@ExcelCellName("trans_product_type")
	private String trans_product_type;

	@ExcelCellName("trans_type")
	private String trans_type;

	@ExcelCellName("trans_amount")
	private String trans_amount;

	@ExcelCellName("trans_parent_id")
	private String trans_parent_id;

	@ExcelCellName("priority")
	private String priority;

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

	public String getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}

	public String getTrans_product_type() {
		return trans_product_type;
	}

	public void setTrans_product_type(String trans_product_type) {
		this.trans_product_type = trans_product_type;
	}

	public String getTrans_type() {
		return trans_type;
	}

	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}

	public String getTrans_amount() {
		return trans_amount;
	}

	public void setTrans_amount(String trans_amount) {
		this.trans_amount = trans_amount;
	}

	public String getTrans_parent_id() {
		return trans_parent_id;
	}

	public void setTrans_parent_id(String trans_parent_id) {
		this.trans_parent_id = trans_parent_id;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Transactions [rowIndex=" + rowIndex + ", emp_Id=" + emp_Id + ", trans_id=" + trans_id
				+ ", trans_product_type=" + trans_product_type + ", trans_type=" + trans_type + ", trans_amount="
				+ trans_amount + ", trans_parent_id=" + trans_parent_id + ", priority=" + priority + "]";
	}

}
