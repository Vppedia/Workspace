package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		// saving Single User into database
		/*
		 * User user=new User(); user.setName("Pankaj"); user.setCity("Punjab");
		 * user.setStatus("Active"); User user2= userRepository.save(user);
		 * System.out.println(user2);
		 */

		/*
		 * 
		 * // saving Multiple User into database User user3 = new User();
		 * 
		 * user3.setName("Shubham"); user3.setCity("Allahbad");
		 * user3.setStatus("Java Programmer");
		 * 
		 * User user5 = new User(); user5.setName("Pranav"); user5.setCity("Jaipur");
		 * user5.setStatus("Python Programmer");
		 * 
		 * List<User> user = List.of(user3, user5);
		 * 
		 * Iterable<User> saveAll = userRepository.saveAll(user);
		 * 
		 * saveAll.forEach(User -> System.out.println(user));
		 * System.out.println("done");
		 */

		//		//Find the User with given Id
		//		 
		//		    Optional<User> findById = userRepository.findById(5);  
		//		        
		//		      User user = findById.get();
		//		       user.setName("Shubham Kushwaha");
		//		       user.setStatus("Rest API Developer");
		//		       
		//		       userRepository.save(user);
		//		     System.out.println(user);
		
		// find all User from the database
	
		
		
		//		Iterable<User> findAll = userRepository.findAll();
		//
		//		Iterator<User> iterator = findAll.iterator();
		//
		//		while (iterator.hasNext()) {
		//			System.out.println(iterator.next());
		//		}
		//
		//		// findAll.forEach(user->System.out.println(user));
		//		
		
		
		//Deleting An User With Given Id
		
		//userRepository.deleteById(2);
		
//		//Derived Query Methods
//		
//		List<User> findByName = userRepository.findByName("Pankaj");
//		findByName.forEach(user->System.out.println(user));	
//		
		
		
		//Using JPQL 
		
		 List<User> allUser = userRepository.getAllUser();
		 
		 System.out.println("Fetching data using JPQL Lang");
		 
		 allUser.forEach(user->System.out.println(user));
		 
		 
		 System.out.println("-----------------------------------");
		 
		 List<User> userByName = userRepository.getUserByName("Pankaj");
		   userByName.forEach(user->System.out.println(user));
		
		   
		   System.out.println("-------------------------------------------");
		   
		   userRepository.getAllUserList().forEach(ee->System.out.println(ee));
		
		
		 	 	

	}

}
