package com.spring.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.demo.beans.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	
	List<Student> findByUsername(String username);
	//List<Student> findByIdBetween(Integer start,Integer stop);
	//List<Student> findByAddressIgnoreCase(String address);
	
	
	/*@Query("select u from User where u.emailAddress= ?1")
	Student findByAddress(String address);*/
}
