package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{
	
	private final EmployeeRepository repository;
	
	@Autowired
	public DatabaseLoader(EmployeeRepository repository){
		this.repository = repository;
	}
	
	@Override
	public void run(String ...strings){
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
		this.repository.save(new Employee("Bilbo", "Baggins", "burglar"));
		this.repository.save(new Employee("Gandalf", "the Grey", "wizard"));
		this.repository.save(new Employee("Samwise", "Gamgee", "gardener"));
		this.repository.save(new Employee("Meriadoc", "Brandybuck", "pony rider..."));
		this.repository.save(new Employee("Peregrin", "Took", "pipe smoker."));
		Employee emp = this.repository.findOne(1L);
		System.out.println(".........Employee" + emp.toString());
	}
}