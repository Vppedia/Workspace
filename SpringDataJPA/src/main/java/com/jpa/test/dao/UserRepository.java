package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	//Derived Query Methods 
	
	public List<User> findByName(String name);
	
	//Using JPQL 
	@Query("Select u from User u")
	public List<User> getAllUser();
	
	@Query("Select u from User u where u.name=:n")
	public List<User> getUserByName(@Param("n") String name);
	
	
	//Using Native Query
	
	@Query(value="select * from User" ,nativeQuery=true)
	public List<User> getAllUserList();

	
	
	
	

}
