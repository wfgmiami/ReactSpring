package com.example.demo;

//import org.springframework.data.repository.CrudRepository;

/*
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}
*/

import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
	
}