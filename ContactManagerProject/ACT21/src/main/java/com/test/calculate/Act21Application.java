package com.test.calculate;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poiji.bind.Poiji;
import com.test.calculate.entity.Employee;
import com.test.calculate.entity.Fraud;
import com.test.calculate.entity.Transactions;


@SpringBootApplication
public class Act21Application {

	public static void main(String[] args) {
		
		
		File file = new File("C:\\Pankaj/employee.xlsx");
		File file1 = new File("C:\\Pankaj/fraud.xlsx");
		
	 File file2 = new File("C:\\Pankaj/transaction.xlsx");
		
		List<Employee> employee = Poiji.fromExcel(file, Employee.class);

		List<Fraud> fraud = Poiji.fromExcel(file1, Fraud.class);

		List<Transactions> transactions = Poiji.fromExcel(file2, Transactions.class);

		  
		
		System.out.println("Printing List Data: " +transactions);

					System.out.println("Printing List Data: " +employee);
					System.out.println("Printing List Data: " +fraud);
					System.out.println("Printing List Data: " +employee.size());
					
					for(int i=0;i<employee.size();i++)
					{
				
						for(int j=0;j<fraud.size();j++)
						{
							if(fraud.get(j).getEmp_Id().contains(employee.get(i).getEmp_Id()))
							{
								
								employee.remove(i);
							}
						}

					}
					
					System.out.println("Printing List Data: " +employee.get(38));
					System.out.println("Printing List Data: " +employee.size());
					
					
	
					
		
	}

}
